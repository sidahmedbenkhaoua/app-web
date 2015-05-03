package dz.sbenkhaoua.roadtraffic.module.config;

/**
 * Created by sbenkhaoua on 06/04/15.
 */
public class PoolConfg {

    private static final CassandraConnection INSTANCE = new CassandraConnection();

    public static CassandraConnection getINSTANCE() {
        return INSTANCE;
    }
}
