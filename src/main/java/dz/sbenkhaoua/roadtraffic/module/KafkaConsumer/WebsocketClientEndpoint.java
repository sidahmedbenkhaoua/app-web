package dz.sbenkhaoua.roadtraffic.module.KafkaConsumer;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * ChatServer Client
 *
 * @author Jiji_Sasidharan
 */
@ClientEndpoint
public final class WebsocketClientEndpoint {
    private static volatile WebsocketClientEndpoint instance;
    private static  Session userSession = null;
    private MessageHandler messageHandler;

    public WebsocketClientEndpoint() {

    }

    public static WebsocketClientEndpoint getInstance() {
        if (instance == null) {
            synchronized (WebsocketClientEndpoint.class) {
                if (instance == null) {
                    instance = new WebsocketClientEndpoint();
                    WebSocketContainer container = ContainerProvider.getWebSocketContainer();
                    try {
                        container.connectToServer(WebsocketClientEndpoint.class, new URI("ws://localhost:8080/app-web/carSpeedEP"));
                    } catch (DeploymentException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }

    public WebsocketClientEndpoint(URI endpointURI) {
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Callback hook for Connection open events.
     *
     * @param userSession the userSession which is opened.
     */
    @OnOpen
    public void onOpen(Session userSession) {
        System.out.println("opening websocket");
        this.userSession = userSession;
    }

    /**
     * Callback hook for Connection close events.
     *
     * @param userSession the userSession which is getting closed.
     * @param reason      the reason for connection close
     */
    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        System.out.println("closing websocket");
        this.userSession = null;
    }

    /**
     * Callback hook for Message Events. This method will be invoked when a client send a message.
     *
     * @param message The text message
     */
    @OnMessage
    public void onMessage(String message) {
        System.out.println("j'ai recue "+message);
    }

    /**
     * register message handler
     *
     * @param message
     */
    public void addMessageHandler(MessageHandler msgHandler) {
        this.messageHandler = msgHandler;
    }

    /**
     * Send a message.
     *
     * @param user
     * @param message
     */
    public void sendMessage(String message) {
        this.userSession.getAsyncRemote().sendText(message);
    }

    /**
     * Message handler.
     *
     * @author Jiji_Sasidharan
     */
    public static interface MessageHandler {

        public void handleMessage(String message);
    }
}