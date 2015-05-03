package dz.sbenkhaoua.roadtraffic.module.tools;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.mapping.MappingSession;
import dz.sbenkhaoua.roadtraffic.module.modules.car.model.Car;

import javax.inject.Inject;

/**
 * Spring Bean wrapper for MappingSession.
 * This class inherits the MappingSession api 
 * And initializes with Datastax Session and Keyspace.
 */

public class BaseDAO extends MappingSession  {
	@Inject
    private CassandraSessionFactory sf;
	public static final String KEYSPACE = "roadtraffic";
	public static final String TABLE_CAR_DATA = "car";
	public static final String USER_DATA_INSERT_STMT = "INSERT INTO " + KEYSPACE   +"."+ TABLE_CAR_DATA +"(id,car_name,color,insert_date,pos_x,pos_y,send_date,speed)values(?,?,?,?,?,?,?,?)";
	public static PreparedStatement insertPstmt = null;

	public CassandraSessionFactory getSessionFactory() {
		return sf;
	}

	public void setSessionFactory(CassandraSessionFactory sf) {
		this.sf = sf;
	}

	public void print(){
	System.out.println("ddsddfsfdsfsdf");
	}
	public void insertValues(Car car) {
		String serverIp ="127.0.0.1";
		Cluster cluster = Cluster.builder()
				.addContactPoints(serverIp)
				.build();
		 session = cluster.connect(KEYSPACE);

		insertPstmt = session.prepare(USER_DATA_INSERT_STMT);
		insertPstmt = session.prepare(USER_DATA_INSERT_STMT);
		sf.getSession().execute(insertPstmt.bind(car.getId(), car.getCarName(), car.getColor(), car.getInsertDate(), car.getPosX(), car.getPosY(), car.getSendDate(), car.getSpeed()));



	}
	
}
