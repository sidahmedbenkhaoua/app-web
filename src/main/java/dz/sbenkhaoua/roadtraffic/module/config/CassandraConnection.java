package dz.sbenkhaoua.roadtraffic.module.config;

import com.datastax.driver.core.*;
import com.datastax.driver.mapping.MappingSession;
import dz.sbenkhaoua.roadtraffic.module.modules.car.model.Car;
import dz.sbenkhaoua.roadtraffic.module.modules.intersection.model.Intersection;
import dz.sbenkhaoua.roadtraffic.module.modules.rdaRecord.model.RdaRecordMaper;
import dz.sbenkhaoua.roadtraffic.module.modules.road.model.Road;

import java.util.List;

/**
 * Created by sbenkhaoua on 05/04/15.
 */
public final class CassandraConnection {
    public  Session session ;
    public static final String KEYSPACE = "roadtraffic";
    public static final String TABLE_CAR_DATA = "car";

    private boolean isDelete = false;





    private static MappingSession mappingSession;

    public CassandraConnection() {
        String serverIp = "127.0.0.1";
        Cluster cluster = Cluster.builder()
                .addContactPoints(serverIp)
                .build();
        session = cluster.connect(KEYSPACE);
        mappingSession = new MappingSession(KEYSPACE, session);




    }




    public void insertValues(Car car) {


        mappingSession.save(car);
    }
    public void insertRoad(Road road) {

        mappingSession.save(road);
    }

    public void insertIntersection(Intersection intersection) {

        mappingSession.save(intersection);
    }

    private void print(String s) {
        System.out.println(s);

    }

    public void deleteAllRoadsRows() {
        ResultSet rs = session.execute("SELECT * FROM road");
        List<Road> result = mappingSession.getFromResultSet(Road.class, rs);
        for (Road road : result) {
            mappingSession.delete(road);
        }
        isDelete = true;
    }

    public void deleteAllIntersRows() {

        ResultSet rs = session.execute("SELECT * FROM intersection");
        List<Intersection> result = mappingSession.getFromResultSet(Intersection.class, rs);
        for (Intersection intersection : result) {
            mappingSession.delete(intersection);
        }
        isDelete = true;
    }

    public int getLasteValue() {
        createIndexType();
        ResultSet resultSet;
        resultSet = session.execute("SELECT * FROM rda_record" + " WHERE active = 'true' ;");
        Row row = resultSet.one();

        return row.getInt("num");
    }

    public String getLasteIDValue() {
        createIndexType();
        ResultSet resultSet;
        resultSet = session.execute("SELECT * FROM rda_record" + " WHERE active = 'true' ;");
        Row row = resultSet.one();
        return row.getString("id");
    }


    public void createIndexType() {
        //Query
        try {
            String query = "CREATE INDEX name ON rda_record (active);";
            //Executing the query
            session.execute(query);
        } catch (Exception e) {
            deleteIndexType();
            getLasteValue();
        }
    }


    public void deleteIndexType() {
        String query = "DROP INDEX name;";
        session.execute(query);
    }

    public void send() {
        System.out.println("dsqdqsd");
    }

    public void saveRdaRecordMaper(RdaRecordMaper rdaRecordMaper) {
        mappingSession.save(rdaRecordMaper);
    }


    public void edtitLastDefalut(String idLastDefault) {
        session.execute("UPDATE rda_record set active= 'false' WHERE id = '"+idLastDefault+"';");

    }
}
