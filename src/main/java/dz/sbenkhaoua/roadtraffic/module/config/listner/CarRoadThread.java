package dz.sbenkhaoua.roadtraffic.module.config.listner;

import dz.sbenkhaoua.roadtraffic.module.KafkaConsumer.ConsumerGroupExample;

/**
 * Created by sbenkhaoua on 04/05/15.
 */
public class CarRoadThread implements Runnable {

    @Override
    public void run(){
        System.out.println("thread started");
        String zooKeeper = "127.0.0.1";
        String groupId = "test-consumer-group";
        String topic = "carRoadCount";
        int threads = Integer.parseInt("3");
        ConsumerGroupExample example = new ConsumerGroupExample(zooKeeper, groupId, topic);
        example.run(threads);
    }

}
