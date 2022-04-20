package com.web.service.soap.client;

import com.web.service.soap.client.AddClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class AddClientConfig {

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("com.web.service.soap.client.wsdl");
    return marshaller;
  }

  @Bean
  public AddClient addClient(Jaxb2Marshaller marshaller){
    AddClient client = new AddClient();
    client.setDefaultUri("http://tempuri.org/");
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }

}
