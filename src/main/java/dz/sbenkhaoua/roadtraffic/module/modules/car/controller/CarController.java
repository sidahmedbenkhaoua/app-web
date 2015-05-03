package dz.sbenkhaoua.roadtraffic.module.modules.car.controller;



import dz.sbenkhaoua.roadtraffic.module.config.PoolConfg;
import dz.sbenkhaoua.roadtraffic.module.modules.car.model.Car;
import dz.sbenkhaoua.roadtraffic.module.tools.PKeyGenerator;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sbenkhaoua on 05/04/15.
 */
@Path("/carCtrl")
public class CarController  extends PoolConfg {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void save(Car car){
        Date date=new Date();
        Timestamp myTimestamp=new Timestamp(date.getTime());
        String dateInsert = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(myTimestamp);
        car.setInsertDate(dateInsert);
        car.setId(PKeyGenerator.get());
        getINSTANCE().insertValues(car);
    }
}
