package dz.sbenkhaoua.roadtraffic.module.websocket;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.logging.Logger;

/**
 * Created by sbenkhaoua on 02/05/15.
 */

@ServerEndpoint(value = "appEndPoint")
public class AppEndPointListner {
    private final Logger log = Logger.getLogger(getClass().getName());

    @OnOpen
    public void open(Session session) {
        log.info("client conected : ");

    }

    @OnMessage
    public void onMessage(final Session session, String m) {
        System.out.println("client message " +m);

    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        log.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }
}
