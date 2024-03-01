package org.designpattern.factory.handler;

import org.designpattern.factory.TemplateSimpleMessage;

public class TemplateMessageHandler implements MessageHandler<TemplateSimpleMessage> {
    @Override
    public void handleMessage(TemplateSimpleMessage message) {
        System.out.println(message.getName());
    }
}
