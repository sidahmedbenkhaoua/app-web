package dz.sbenkhaoua.roadtraffic.module.config;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import java.io.IOException;
import java.net.URI;

/**
 * Created by sbenkhaoua on 06/04/15.
 */
public class PoolConfg {

    private static volatile CassandraConnection instance ;

    public static CassandraConnection getINSTANCE() {
        if (instance == null) {
            synchronized (PoolConfg.class) {
                if (instance == null) {
                    instance=new CassandraConnection();
                }
            }
        }
        return instance;
    }
}
