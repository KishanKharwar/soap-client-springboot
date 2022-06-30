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
   
How to generate .exe file using maven plugin :
==============================================

1. change the informations inside `plugin-> executions -> execution -> configuration`
   1. `<jar>target/<your-jar-name></jar>`
   1. `<outfile>target/<your-exe-name>.exe</outfile>`
   1. `<classPath>
         <mainClass>com.web.service.soap.client.SoapClientApplication</mainClass>
         <preCp>anything</preCp>
      </classPath>`

Reference Links :
==================

* [spring-boot-soap-client][https://www.devglan.com/spring-boot/spring-boot-soap-client]
* [correct plugin information - 1][https://www.javafixing.com/2021/12/fixed-maven-does-not-execute-launch4j.html]
* [correct plugin information - 2][https://stackoverflow.com/questions/58272275/how-to-create-an-exe-file-with-launch4j-and-maven]
* [should not use '-shaded.jar'][https://stackoverflow.com/questions/48018943/generate-exe-with-launch4j-with-maven-project]
* [youtube link for jar to exe][https://www.youtube.com/watch?v=GIyIWpC5YIw]
* [generate .exe file using launch4j tool][https://genuinecoder.com/convert-java-jar-to-exe/ ]
* [sample link][https://howtodoinjava.com/maven/create-windows-exe-file-for-java-application/]