package com.web.service.soap.client;

import com.web.service.soap.client.wsdl.DetailsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication implements CommandLineRunner {

  @Autowired
  private Controller controller;

  public static void main(String[] args) {
    SpringApplication.run(SoapClientApplication.class, args).close();
  }

  @Override
  public void run(String... args) throws Exception {
    DetailsType type = controller.sum("46062817");
    System.out.println(type);
  }
}
