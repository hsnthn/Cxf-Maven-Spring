package com.team.webservice.interfaces;

import javax.jws.WebService;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.team.generatedCode.IsimGetirRequest;
import com.team.generatedCode.IsimGetirResponse;
import com.team.generatedCode.SimpleService;
import com.team.generatedCode.SiparisGetirRequest;
import com.team.generatedCode.SiparisGetirResponse;


@WebService(endpointInterface = "com.team.generatedCode.SimpleService")
public class SimpleServiceImpl implements SimpleService{
	private static final Logger log = LogManager.getLogger(SimpleServiceImpl.class);
	IsimGetirResponse isimGetirResponse =null;
	SiparisGetirResponse siparisGetirResponse = null;

	public IsimGetirResponse isimGetir(IsimGetirRequest parameters) throws NullPointerException{
		log.info("Web Service isimGetir method is starting...");
		if(null != parameters.getAd() && null != parameters.getSoyad()){
			isimGetirResponse = new IsimGetirResponse();
			isimGetirResponse.setOut(parameters.getAd() + " " + parameters.getSoyad());
			log.info("Web Service isimGetir successed...");
		}
		return isimGetirResponse;
	}

	public SiparisGetirResponse siparisGetir (SiparisGetirRequest siparis) throws NullPointerException{
		log.info("Web Service siparisGetir method is starting...");
		if(null != siparis){
			siparisGetirResponse=new SiparisGetirResponse();
			siparisGetirResponse.setOut(siparis.getSiparis().getS1());
			log.info("Web Service siparisGetir successed...");
		}
		return siparisGetirResponse;
	}

}
