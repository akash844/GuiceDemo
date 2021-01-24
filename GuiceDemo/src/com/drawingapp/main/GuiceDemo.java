package com.drawingapp.main;

import com.drawingapp.module.AppModule;
import com.drawingapp.requests.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {

	private static final String SQUARE_REQ = "SQUARE"; 
	
	private static void sendRequest(String squareReq) {
		
		if(squareReq.equals(SQUARE_REQ)) {
			/*DrawShape d = new DrawSquare();*/
			Injector injector = Guice.createInjector(new AppModule());
			SquareRequest request1 = injector.getInstance(SquareRequest.class);
			request1.makeRequest(); 
			
			SquareRequest request2 = injector.getInstance(SquareRequest.class);
			request2.makeRequest();
			
			boolean areSquareRequestsEqual = request1 == request2;
			System.out.println("Are SquareRequests equal : " + areSquareRequestsEqual);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		sendRequest(SQUARE_REQ);

	}

}
