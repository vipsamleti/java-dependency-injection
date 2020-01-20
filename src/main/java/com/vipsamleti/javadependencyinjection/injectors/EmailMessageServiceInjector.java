package com.vipsamleti.javadependencyinjection.injectors;

import com.vipsamleti.javadependencyinjection.processors.MessageServiceProcessor;
import com.vipsamleti.javadependencyinjection.processors.MessageServiceProcessorImpl;
import com.vipsamleti.javadependencyinjection.services.EmailMessageService;

public class EmailMessageServiceInjector implements MessageServiceInjectors {

    @Override
    public MessageServiceProcessor getMessageServiceProcessor() {
        return new MessageServiceProcessorImpl(new EmailMessageService());
    }

}
