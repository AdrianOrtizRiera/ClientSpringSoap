package com.adrian.ortiz.ClientSpringSoap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adrian.ortiz.schemas.actors.GetAllActorsRequest;
import com.adrian.ortiz.schemas.actors.GetAllActorsResponse;

@SpringBootApplication
public class ClientSpringSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientSpringSoapApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
			@SuppressWarnings("unused")
			String name="Actor";
			
			GetAllActorsRequest request = new GetAllActorsRequest();
			GetAllActorsResponse response = (GetAllActorsResponse) soapConnector.callWebService("http://localhost:8080/ws/actors.wsdl", request);
			System.out.println(response.getActorType());
		};
	}
}