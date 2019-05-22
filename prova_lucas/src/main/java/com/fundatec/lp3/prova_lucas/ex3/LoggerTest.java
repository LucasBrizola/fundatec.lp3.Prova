package com.fundatec.lp3.prova_lucas.ex3;

/**
 * tester do singleton logger
 *
 */
public class LoggerTest 
{
    public static void main( String[] args ) {
    	Logger logger = Logger.getInstance();
    	logger.log("saida da chamada X");
    	logger.log("chamada de metodo Y");
    	logger.log("chamada de metodo Z");
    	
    	System.out.println(logger.getFullLogs());
    	}
}
