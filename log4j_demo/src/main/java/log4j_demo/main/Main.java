package log4j_demo.main;

import org.apache.log4j.Logger;

import log4j_demo.service.log4jService;

public class Main {

	private static Logger log=Logger.getLogger(Main.class);
	public static void main(String[] args) {
	log.trace("hello from trace");
	log.debug("hello from debug");
	log.info("hello from info");
	log.warn("hello from warn");
	log.error("hello from error");
	
	log4jService ser=new log4jService();
	log.debug("makking call to logservice");
	ser.helloService();
	log.debug("completed call from logservice");
	
}
}
