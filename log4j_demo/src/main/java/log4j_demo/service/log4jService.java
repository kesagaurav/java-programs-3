package log4j_demo.service;

import org.apache.log4j.Logger;

import com.example.dao.LogrjDao;

public class log4jService {
	private static Logger log=Logger.getLogger(log4jService.class);
	private LogrjDao dao=new LogrjDao();
	public void helloService() {
		log.debug("\n helllo from service");
		log.info("hello from customer from logservice");
		dao.helloService();
		log.debug("bye from logservice");
	}
}
