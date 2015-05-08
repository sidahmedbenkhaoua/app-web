package dz.sbenkhaoua.roadtraffic.module.config.listner;

import dz.sbenkhaoua.roadtraffic.module.KafkaConsumer.ConsumerGroupExample;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.concurrent.ManagedExecutorService;
import java.util.logging.Logger;

/**
 * Created by sbenkhaoua on 03/05/15.
 */


public class CarRoadCountKafkaListner  {

    @PostConstruct
    public void init(){
        new Thread(new HelloKafkaConsumer()).start();
    }
    public CarRoadCountKafkaListner(){

    }




}
