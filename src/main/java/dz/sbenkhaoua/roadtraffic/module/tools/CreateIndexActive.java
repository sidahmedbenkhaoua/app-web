package dz.sbenkhaoua.roadtraffic.module.tools;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

/**
 * Created by sbenkhaoua on 04/05/15.
 */
public class CreateIndexActive {

    public static String create() {
       try {


        //Query
        String query = "CREATE INDEX name ON rda_record (active);";
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect("roadtraffic");

        //Executing the query
        session.execute(query);
        return "Index created";
       }catch (Exception e){
            delete();
            create();
       }
        return "";
    }
    public static String delete(){
        try {


        //Query
        String query = "DROP INDEX name;";

        //Creating cluster object
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect("roadtraffic");

        //Executing the query
        session.execute(query);

        return "Index dropped";
        }catch (Exception e){
            create();
            delete();
        }
        return "";
    }
}
