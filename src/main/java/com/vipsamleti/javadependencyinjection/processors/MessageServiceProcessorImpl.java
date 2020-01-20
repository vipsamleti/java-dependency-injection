package com.vipsamleti.javadependencyinjection.processors;

import com.vipsamleti.javadependencyinjection.services.MessageService;

public class MessageServiceProcessorImpl implements MessageServiceProcessor {

    MessageService messageService;

    public MessageServiceProcessorImpl(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessageService(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }

}
