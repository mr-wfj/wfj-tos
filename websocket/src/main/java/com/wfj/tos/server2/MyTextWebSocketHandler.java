package com.wfj.tos.server2;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class MyTextWebSocketHandler extends TextWebSocketHandler {

    protected void handleTextMessage(WebSocketSession session, TextMessage message) {

    }
}
