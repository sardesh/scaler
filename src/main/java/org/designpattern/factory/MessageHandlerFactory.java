package org.designpattern.factory;

import org.designpattern.factory.handler.MessageHandler;
import org.designpattern.factory.handler.NonTemplateMessageHandler;
import org.designpattern.factory.handler.TemplateMessageHandler;

public class MessageHandlerFactory {
    public static MessageHandler<?> getMessageHandler(SimpleMessage message) {
        if (message instanceof TemplateSimpleMessage) {
            return new TemplateMessageHandler();
        } else if (message instanceof NonTemplateSimpleMessage) {
            return new NonTemplateMessageHandler();
        }
        throw new IllegalArgumentException("Message type not supported");
    }
}
