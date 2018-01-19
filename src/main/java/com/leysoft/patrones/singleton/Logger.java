package com.leysoft.patrones.singleton;

import java.util.Date;

public class Logger {
	
	private static Logger logger;
	
	private Logger() {}
	
	public static synchronized Logger getInstancia() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	public void log(String mensaje) {
		Date date = new Date();
		System.out.println(date.toString() + ": " + mensaje);
	}
}