package dz.sbenkhaoua.roadtraffic.module.endPoint;

import dz.sbenkhaoua.roadtraffic.module.KafkaConsumer.ConsumerGroupExample;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.OnError;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sbenkhaoua on 03/05/15.
 */
@ServerEndpoint(value = "/carRoadCountEP")
public class CarRoadCountEP {
       private static final Set<Session> clientSessions = Collections
            .synchronizedSet(new HashSet<Session>());
    @OnOpen
    public void onOpen(Session session) {
        clientSessions.add(session);

        System.out.println("connected " +session.getId());
    }
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        for (Session clientSession : clientSessions) {
            clientSession.getBasicRemote().sendText(message);
            System.out.println("recive from client " + message);
        }
    }
    @OnClose
    public void onClose(Session session) {
        clientSessions.remove(session);
    }
    @OnError
    public void onError(Throwable exception, Session session) {
        System.out.println("error");
    }
}
