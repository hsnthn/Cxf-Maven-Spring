
package com.team.generatedCode;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class was generated by Apache CXF 2.6.4
 * 2013-01-02T11:12:03.351+02:00
 * Generated source version: 2.6.4
 * 
 */
public final class SimpleService_P1_Client {

	private static final Logger log = LogManager.getLogger(SimpleService_P1_Client.class);

	private SimpleService_P1_Client() {
	}

	public static void main(String args[]) throws java.lang.Exception {

		ClassPathXmlApplicationContext context	= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		SimpleService client = (SimpleService) context.getBean("simpleService");

		log.info("Invoking siparisGetir...");

		SiparisGetirRequest _siparisGetir_parameters = new SiparisGetirRequest();
		Siparis siparis=new Siparis();
		siparis.setS1("s1");
		siparis.setS2("S2");
		_siparisGetir_parameters.setSiparis(siparis);

		try {
			SiparisGetirResponse _siparisGetir__return = client.siparisGetir(_siparisGetir_parameters);
			log.info("siparisGetir.result=" + _siparisGetir__return.getOut());
		} catch (Exception e) {
			log.error("SiparisGetir failed "+e.getMessage());
		} 

		log.info("Invoking isimGetir...");
		IsimGetirRequest _isimGetir_parameters = new IsimGetirRequest();

		try{
			IsimGetirResponse _isimGetir__return = client.isimGetir(_isimGetir_parameters);
			log.info("isimGetir.result=" + _isimGetir__return.getOut());
		} catch (Exception e) {
			log.error("İsimGetir failed "+e.getMessage());
		}
		System.exit(0);
	}

}