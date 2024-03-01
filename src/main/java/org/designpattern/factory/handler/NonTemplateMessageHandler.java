package org.designpattern.factory.handler;

import org.designpattern.factory.NonTemplateSimpleMessage;
import org.designpattern.factory.SimpleMessage;

public class NonTemplateMessageHandler implements MessageHandler<NonTemplateSimpleMessage> {
    @Override
    public void handleMessage(NonTemplateSimpleMessage message) {
        System.out.println(message.getName());
    }
}
