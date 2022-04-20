package com.web.service.soap.client;

import com.web.service.soap.client.wsdl.DetailsType;
import com.web.service.soap.client.wsdl.GetBankResponseType;
import com.web.service.soap.client.wsdl.GetBankType;
import com.web.service.soap.client.wsdl.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  private BlzServiceAdapter blzServiceAdapter;

  @GetMapping("/getBank")
  public DetailsType sum(@RequestParam String code) {
    ObjectFactory objectFactory = new ObjectFactory();
    GetBankType type = new GetBankType();
    type.setBlz(code);
    GetBankResponseType response = blzServiceAdapter
        .getBank("http://www.thomas-bayer.com/axis2/services/BLZService",
            objectFactory.createGetBank(type));
    return response.getDetails();
  }
}
