package dz.sbenkhaoua.roadtraffic.module.KafkaConsumer;


import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by sbenkhaoua on 03/05/15.
 */
public class ConsumerTest implements Runnable {
    private KafkaStream m_stream;
    private int m_threadNumber;
    WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint().getInstance();

    public ConsumerTest(KafkaStream a_stream, int a_threadNumber) {
        m_threadNumber = a_threadNumber;
        m_stream = a_stream;
    }

    public void run() {
        ConsumerIterator<byte[], byte[]> it = m_stream.iterator();
        while (it.hasNext()) {
            System.out.println(new String(it.next().message()));
            //new WSClient().onMessage(new String(it.next().message()));



            // add listener
            clientEndPoint.addMessageHandler(new WebsocketClientEndpoint.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);
                }
            });

            // send message to websocket
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'ok_btccny'");
        }

    }
}