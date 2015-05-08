package dz.sbenkhaoua.roadtraffic.module.modules.car.controller;


import dz.sbenkhaoua.roadtraffic.module.modules.car.model.Car;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;


/**
 * Created by sbenkhaoua on 25/04/15.
 */
public class CarSenderData {
    private static Logger log = Logger.getLogger(CarSenderData.class);

   public static void send(Car car){

        long events = 5;
        Random rnd = new Random();
        Properties props = new Properties();
        props.put("metadata.broker.list", "localhost:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("partitioner.class", "dz.sbenkhaoua.roadtraffic.module.tools.SimplePartitioner");
        props.put("request.required.acks", "1");
        ProducerConfig config = new ProducerConfig(props);
        //Producer<String, String> producer = new Producer<String, String>(config);
       ObjectMapper mapper = new ObjectMapper();



            Producer producer = new Producer<String, Object>(new ProducerConfig(props));

       String carJSON=null;
       try {
            carJSON= mapper.writeValueAsString(car);
       } catch (IOException e) {
           e.printStackTrace();
       }
       KeyedMessage<String, Object> message = new KeyedMessage<String, Object>("page_visits",carJSON);
           producer.send(message);

       producer.close();


    }
}
