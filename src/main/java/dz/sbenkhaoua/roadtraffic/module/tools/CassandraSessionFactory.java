package dz.sbenkhaoua.roadtraffic.module.tools;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 * This class is responsible for opening Datastax Session to Cassandra Cluster.
 * And creating keyspace if it does not exists yet.
 */
@ManagedBean
public class CassandraSessionFactory  {


    protected String node="localhost";
    

    protected String keyspace="roadtraffic";
    
    protected Cluster cluster;
	protected Session session;
	
    /** only 1 thread is permitted to open connection */
    private void connect() {
        if (session == null) {
            cluster = Cluster.builder().addContactPoint(node).build();
            session = cluster.connect(this.getKeyspace());
			System.out.println("connectd");

        }   
    }
	
    public Session getSession() {
        return session;
    }

	public void setSession(Session session) {
		this.session = session;
	}

	public String getKeyspace() {
		return keyspace;
	}

	public void setKeyspace(String keyspace) {
		this.keyspace = keyspace;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

    @PostConstruct
	public void init(){
		connect();
	}
}
