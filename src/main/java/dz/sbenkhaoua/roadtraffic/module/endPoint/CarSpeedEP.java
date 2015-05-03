package dz.sbenkhaoua.roadtraffic.module.endPoint;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sbenkhaoua on 03/05/15.
 */
@ServerEndpoint(value = "/carSpeedEP")
public class CarSpeedEP {
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
            clientSession.getBasicRemote().sendText("ana babakome rani b3atalkome "+message);
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
