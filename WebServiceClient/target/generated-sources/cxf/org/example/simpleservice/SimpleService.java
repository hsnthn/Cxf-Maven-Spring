package org.example.simpleservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.4
 * 2013-01-04T11:31:25.066+02:00
 * Generated source version: 2.6.4
 * 
 */
@WebService(targetNamespace = "http://www.example.org/SimpleService/", name = "SimpleService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SimpleService {

    @WebResult(name = "siparisGetirResponse", targetNamespace = "http://www.example.org/SimpleService/", partName = "parameters")
    @WebMethod(action = "http://www.example.org/SimpleService/siparisGetir")
    public SiparisGetirResponse siparisGetir(
        @WebParam(partName = "parameters", name = "siparisGetirRequest", targetNamespace = "http://www.example.org/SimpleService/")
        SiparisGetirRequest parameters
    );

    @WebResult(name = "isimGetirResponse", targetNamespace = "http://www.example.org/SimpleService/", partName = "parameters")
    @WebMethod(action = "http://www.example.org/SimpleService/isimGetir")
    public IsimGetirResponse isimGetir(
        @WebParam(partName = "parameters", name = "isimGetirRequest", targetNamespace = "http://www.example.org/SimpleService/")
        IsimGetirRequest parameters
    );
}
