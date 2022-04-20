package com.web.service.soap.client;

import com.web.service.soap.client.wsdl.AddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  private AddClient client;

  @GetMapping("/add")
  public AddResponse addNumbers(){
    AddResponse response = client.getAddResponse(1,2);
    System.out.println(response);
    return response;
  }
}
