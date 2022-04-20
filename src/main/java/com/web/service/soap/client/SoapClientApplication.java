package com.web.service.soap.client;

import com.web.service.soap.client.wsdl.AddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication {

	@Autowired
	private AddClient client;

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}

}
