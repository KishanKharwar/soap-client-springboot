SOAP CLient Using SpringBoot
=============================

Coding :
==========

1. Get the wsdl url eg., http://www.thomas-bayer.com/axis2/services/BLZService?wsdl
1. Copy the wsdl to the resources folder
1. add `maven-jaxb2-plugin` in pom for generating the stub classes.
1. run `mvn clean install` for generating the classes into specified package
1. create 2 classes eg., BlzServiceAdapter for marshalling the request and url.
    1. here the url will be the service url from the wsdl file.
1. create configuration class eg., BeanConfig for unmarshalling
    1. here also the url will be the service url from the wsdl file.
1. create a rest controller to check whether the functionality is working or not eg., Controller.

How to run the application :
===============================

1. Sample url : http://localhost:8080/getBank?code=46062817
1. Sample output : {"bezeichnung":"Volksbank Schmallenberg","bic":"GENODEM1SMA","ort":"
   Schmallenberg","plz":"57377"}

Reference Links :
==================

* [spring-boot-soap-client][https://www.devglan.com/spring-boot/spring-boot-soap-client]