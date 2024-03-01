package org.designpattern.factory;

public class FactoryApplication {
    public static void main(String[] args) {
        // these messages also coming from some factory. eg SimpleMessage Factory
        SimpleMessage message1 = new TemplateSimpleMessage();
        SimpleMessage message2 = new NonTemplateSimpleMessage();

        //@TODO need to fix this
        // Handlers are singleton and doesn't hold state that's why I need to pass message
        // What can be the best way to fix this use case
        MessageHandlerFactory.getMessageHandler(message1).handleMessage(message1);
        MessageHandlerFactory.getMessageHandler(message2).handleMessage(message2);
    }
}
