package com.example.dao;

import org.apache.log4j.Logger;

public class LogrjDao {
private static Logger log=Logger.getLogger(LogrjDao.class);
public void helloService() {
	log.debug("hello");
	log.info("hi");
	log.debug("bye from logdao");
}
	
}
