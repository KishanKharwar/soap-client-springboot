package com.web.service.soap.client;

import com.web.service.soap.client.wsdl.Add;
import com.web.service.soap.client.wsdl.AddResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AddClient extends WebServiceGatewaySupport {

  public AddResponse getAddResponse(int a , int b){
    Add request = new Add();
    request.setIntA(a);
    request.setIntB(b);
    System.out.println("checking");
    AddResponse response = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx/Add",request);
    return response;
  }
}
