package dz.sbenkhaoua.roadtraffic.module.modules.car.controller;


import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import java.util.Properties;
import java.util.Random;


/**
 * Created by sbenkhaoua on 25/04/15.
 */
public class CarSenderData {
    private static Logger log = Logger.getLogger(CarSenderData.class);

    public static void main(String[] args) {
        long events = 5;
        Random rnd = new Random();
        Properties props = new Properties();
        props.put("metadata.broker.list", "localhost:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("partitioner.class", "sbenkhaoua.app.tools.SimplePartitioner");
        props.put("request.required.acks", "1");
        ProducerConfig config = new ProducerConfig(props);
        //Producer<String, String> producer = new Producer<String, String>(config);


        while (true) {
            Producer producer = new Producer<String, Object>(new ProducerConfig(props));
            JSONObject record = new JSONObject();
            record.put("name", "sqdqsd");
            record.put("type", "sqdqsd");
            KeyedMessage<String, Object> message = new KeyedMessage<String, Object>("page_visits", record.toString());
            producer.send(message);
            producer.close();
        }

    }
}
