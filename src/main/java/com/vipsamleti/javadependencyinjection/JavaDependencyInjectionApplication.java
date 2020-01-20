package com.vipsamleti.javadependencyinjection;

import com.vipsamleti.javadependencyinjection.injectors.EmailMessageServiceInjector;
import com.vipsamleti.javadependencyinjection.injectors.MessageServiceInjectors;
import com.vipsamleti.javadependencyinjection.injectors.SMSMessageServiceInjector;
import com.vipsamleti.javadependencyinjection.processors.MessageServiceProcessor;
import com.vipsamleti.javadependencyinjection.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDependencyInjectionApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaDependencyInjectionApplication.class, args);

		MessageServiceInjectors messageServiceInjectors;
		MessageServiceProcessor messageServiceProcessor;

		//send email
		messageServiceInjectors = new EmailMessageServiceInjector();
		messageServiceProcessor = messageServiceInjectors.getMessageServiceProcessor();
		messageServiceProcessor.processMessageService("Sending message through Email", "vipin@email.com");

		//send SMS
		messageServiceInjectors = new SMSMessageServiceInjector();
		messageServiceProcessor = messageServiceInjectors.getMessageServiceProcessor();
		messageServiceProcessor.processMessageService("Sending message trough SMS", "Vipin Samleti");

	}

}
