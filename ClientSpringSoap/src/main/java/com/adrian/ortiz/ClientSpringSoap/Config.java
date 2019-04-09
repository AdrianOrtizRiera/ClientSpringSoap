package com.adrian.ortiz.ClientSpringSoap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.adrian.ortiz.schemas.actors");
		return marshaller;
	}
	
	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
		SOAPConnector client = new SOAPConnector();
		client.setDefaultUri("http://localhost:8080/ws/actors");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		return client;
	}
	
	
}
