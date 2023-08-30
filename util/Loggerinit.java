package com.saucelab.util;

import org.apache.logging.log4j.*;

public class Loggerinit {

	public static Logger logger = LogManager.getLogger(Loggerinit.class);

	public static void main(String[] args) {
		
		logger.error("This is a error");
		logger.trace("This is a trace");
		logger.warn("this is a warning");
		logger.fatal("This is a fatal");
		logger.info("This is a info");
	}
}
