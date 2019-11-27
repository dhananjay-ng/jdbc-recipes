package com.pluralsight.corejdbc.m7c1;

public class MainClass implements Runnable{
	
	public void run() {
		for(int i = 0; i < 3; i++) {
			
			try {
				
				OrdersComponent comp = new OrdersComponent();
				comp.tryConnection();

			}catch (Exception exception) {
				;
			}
		}
	}

	public static void main(String [] args) {
		
		new ConnectionPool();
		
		System.out.println("Thread   Conn");
		System.out.println("------   ----");
		
		for(int i = 0; i < 5; i++) {
			
			Thread t = new Thread(new MainClass(), "Main_" + i);
			t.start();
			
		}
	}
	
	public static long sleepInterval() {
		Double randomDouble = MainClass.randomize(0,500);
		return Math.round(randomDouble);
		
	}
	public static double randomize(double min, double max){
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
	

}
