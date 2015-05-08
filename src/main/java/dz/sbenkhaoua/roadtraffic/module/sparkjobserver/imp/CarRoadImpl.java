package dz.sbenkhaoua.roadtraffic.module.sparkjobserver.imp;

import dz.sbenkhaoua.roadtraffic.module.sparkjobserver.interfaces.CarRoadInterfaces;
import dz.sbenkhaoua.roadtraffic.module.sparkjobserver.model.CarRoad;
import dz.sbenkhaoua.roadtraffic.module.sparkjobserver.outile.FindData;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.IOException;
import java.util.List;

/**
 * Created by sbenkhaoua on 08/05/15.
 */
@Stateless
public class CarRoadImpl implements CarRoadInterfaces {
    Logger log = LoggerFactory.getLogger(CarRoadImpl.class);
    @Override
    public String findNumberCarInRoadBetweenDate(String d1, String d2) {
        String result="";
        String data="";
        try {
            FindData findData=new FindData();
             data = findData.get("");
            System.out.println(data);
            JSONObject jsonObj = new JSONObject(data);
             result = jsonObj.getString("result");
            log.info(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<CarRoad> findNumberCarInRoadReelTime() {
        return null;
    }
}
