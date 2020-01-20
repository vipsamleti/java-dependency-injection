package com.vipsamleti.javadependencyinjection.services;

public class SMSMessageService implements MessageService {

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println(message + " to " + recipient);
    }
}
