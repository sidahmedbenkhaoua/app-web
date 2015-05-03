package dz.sbenkhaoua.roadtraffic.module.modules.road.controller;


import dz.sbenkhaoua.roadtraffic.module.config.PoolConfg;
import dz.sbenkhaoua.roadtraffic.module.modules.road.model.Road;
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
 * Created by sbenkhaoua on 06/04/15.
 */
@Path("/roadCtrl")
public class RoadController extends PoolConfg {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void save(Road road){
        Date date=new Date();
        Timestamp myTimestamp=new Timestamp(date.getTime());
        String dateInsert = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(myTimestamp);
        road.setInsertDate(dateInsert);
        road.setId(PKeyGenerator.get());
        getINSTANCE().insertRoad(road);
    }
    @Path("deleteRoads")
    @POST
    public void deleteRoad(){
        getINSTANCE().deleteAllRoadsRows();
    }
}
