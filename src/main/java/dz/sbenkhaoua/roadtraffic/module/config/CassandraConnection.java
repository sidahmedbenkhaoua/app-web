package dz.sbenkhaoua.roadtraffic.module.config;

import com.datastax.driver.core.*;
import com.datastax.driver.mapping.MappingSession;
import dz.sbenkhaoua.roadtraffic.module.modules.car.model.Car;
import dz.sbenkhaoua.roadtraffic.module.modules.intersection.model.Intersection;
import dz.sbenkhaoua.roadtraffic.module.modules.road.model.Road;

import java.util.List;

/**
 * Created by sbenkhaoua on 05/04/15.
 */
public final class CassandraConnection {
    public static Session session = null;
    public static final String KEYSPACE = "roadtraffic";
    public static final String TABLE_CAR_DATA = "car";

    public static PreparedStatement insertPstmt = null;
    public static PreparedStatement selectStmt = null;
    public static PreparedStatement deleteStmt = null;
    public static PreparedStatement updateStmt = null;
    private boolean isDelete=false;

    public static final String USER_DATA_INSERT_STMT = "INSERT INTO " + KEYSPACE + "." + TABLE_CAR_DATA + "(id,car_name,color,insert_date,pos_x,pos_y,send_date,speed)values(?,?,?,?,?,?,?,?)";


    private static volatile CassandraConnection instance;
    private static MappingSession mappingSession;

    public CassandraConnection() {
        String serverIp = "127.0.0.1";
        Cluster cluster = Cluster.builder()
                .addContactPoints(serverIp)
                .build();
        session = cluster.connect(KEYSPACE);
        mappingSession = new MappingSession(KEYSPACE, session);


        ///  insertPstmt = session.prepare(USER_DATA_INSERT_STMT);

    }

    /**
     * Get the only instance of this class.
     *
     * @return the single instance.
     */
    public static CassandraConnection getInstance() {
        if (instance == null) {
            synchronized (CassandraConnection.class) {
                if (instance == null) {
                    instance = new CassandraConnection();
                }
            }
        }
        return instance;
    }


    public void insertValues(Car car) {
        // session.execute(insertPstmt.bind(car.getId(),car.getCarName(),car.getColor(),car.getInsertDate(),car.getPosX(),car.getPosY(),car.getSendDate(),car.getSpeed()));
        // initialize datastax session.

        mappingSession.save(car);
    }

    public void retriveValues() {
        try {
            ResultSet rs = session.execute(selectStmt.bind());
            if (rs != null) {
                List<Row> rows = rs.all();
                if (rows != null) {
                    for (Row row : rows) {
                        System.out.println(row);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in select Stament" + e.getMessage());
        }
    }

    public void deleteValues() throws Exception {
        try {
            session.execute(deleteStmt.bind("Ramu"));
        } catch (Exception e) {
            throw e;
        }
    }

    public void updateValues() throws Exception {
        try {
            session.execute(updateStmt.bind(18L, "Ramu"));
        } catch (Exception e) {
            throw e;
        }
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
        isDelete=true;
    }

    public void deleteAllIntersRows() {

        ResultSet rs = session.execute("SELECT * FROM intersection");
        List<Intersection> result = mappingSession.getFromResultSet(Intersection.class, rs);
        for (Intersection intersection : result) {
            mappingSession.delete(intersection);
        }
        isDelete=true;
    }


   public void send(){
       System.out.println("dsqdqsd");
   }





}
