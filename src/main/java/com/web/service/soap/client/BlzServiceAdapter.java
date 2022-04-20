package com.web.service.soap.client;

import com.web.service.soap.client.wsdl.GetBankResponseType;
import javax.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class BlzServiceAdapter extends WebServiceGatewaySupport {
  public GetBankResponseType getBank(String url, Object request){
    JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
    return (GetBankResponseType) res.getValue();
  }
}
