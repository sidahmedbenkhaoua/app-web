package dz.sbenkhaoua.roadtraffic.module.sparkjobserver.interfaces;

import dz.sbenkhaoua.roadtraffic.module.sparkjobserver.model.CarRoad;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by sbenkhaoua on 08/05/15.
 */
@Local
public interface CarRoadInterfaces {

    public String findNumberCarInRoadBetweenDate(String d1,String d2);

    public List<CarRoad> findNumberCarInRoadReelTime();

}
