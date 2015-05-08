package dz.sbenkhaoua.roadtraffic.module.modules.rdaRecord.controller;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.MappingSession;
import dz.sbenkhaoua.roadtraffic.module.config.PoolConfg;
import dz.sbenkhaoua.roadtraffic.module.modules.rdaRecord.model.RdaRecordMaper;
import dz.sbenkhaoua.roadtraffic.module.tools.CreateIndexActive;
import dz.sbenkhaoua.roadtraffic.module.tools.PKeyGenerator;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Date;


/**
 * Created by sbenkhaoua on 04/05/15.
 */
@Path("rdaCtrl")
public class RdaRecordController extends PoolConfg {

    @POST
    public void addNum() {
//        CreateIndexActive.create();
//        Cluster cluster = Cluster.builder().addContactPoints("127.0.0.1")
//                .build();
//        Session session = cluster.connect("roadtraffic");
//        CreateIndexActive.create();
//        ResultSet resultSet;
//        MappingSession mappingSession = new MappingSession("roadtraffic", session);
//        resultSet = session.execute("SELECT * FROM rda_record" + " WHERE active = 'true' ;");
//        Row row = resultSet.one();
//        int num = row.getInt("num");
//        String id = row.getString("id");
//        RdaRecordMaper rdaRecordMaper = new RdaRecordMaper();
//        rdaRecordMaper.setDateRecord(new Date());
//        rdaRecordMaper.setId(PKeyGenerator.get());
//        rdaRecordMaper.setNum(num);
//        rdaRecordMaper.setActive("true");
//        getINSTANCE().saveRdaRecordMaper(rdaRecordMaper);
//        session.execute("UPDATE rda_record SET active ='false' WHERE id ='" + id + "';");
//        session.close();
//        cluster.close();
    }


}
