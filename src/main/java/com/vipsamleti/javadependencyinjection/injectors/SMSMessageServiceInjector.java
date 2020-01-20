package com.vipsamleti.javadependencyinjection.injectors;

import com.vipsamleti.javadependencyinjection.processors.MessageServiceProcessor;
import com.vipsamleti.javadependencyinjection.processors.MessageServiceProcessorImpl;
import com.vipsamleti.javadependencyinjection.services.SMSMessageService;

public class SMSMessageServiceInjector implements MessageServiceInjectors {
    @Override
    public MessageServiceProcessor getMessageServiceProcessor() {
        return new MessageServiceProcessorImpl(new SMSMessageService());
    }
}
