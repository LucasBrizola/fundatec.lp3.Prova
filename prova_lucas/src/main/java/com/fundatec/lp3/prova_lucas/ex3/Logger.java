package com.fundatec.lp3.prova_lucas.ex3;

import java.util.ArrayList;

public class Logger {

	private static Logger logger = null;
	ArrayList<String> logs = new ArrayList<String>();
	
	public void log(String text) {
		logs.add(text);
	};

	public ArrayList<String> getFullLogs() {
		return logs;

	}

	public static Logger getInstance() {
		if (logger == null)
			logger = new Logger();
		return logger;
	};
	
	private Logger() {
	}
}
