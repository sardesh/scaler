package org.designpattern.factory.handler;

import org.designpattern.factory.SimpleMessage;

public interface MessageHandler<T extends SimpleMessage> {
    void handleMessage(T message);

}
