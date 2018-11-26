package com.example.demo;

import java.util.Random;

public class ThreadTest {

	private static Random random = new Random();
	static String threadName = "";
	static String threadName2 = "";
	
	  public static void main(String[] args) {
		
		
		int delay = 1000 + random.nextInt(4000);
		int delay2 = 1000 + random.nextInt(4000);
		
	    Thread thread = new Thread(() -> {
	      threadName = Thread.currentThread().getName();
	      System.out.println(threadName);
	      try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(threadName + "***********************");
	    });
	   
	   
	  Thread thread2 = new Thread(() -> {
	      threadName2 = Thread.currentThread().getName();
	      System.out.println(threadName2);
	      try {
			Thread.sleep(delay2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    System.out.println(threadName2 + "*****************");
	    });
	  
	  	thread.setName("Thread #1");
	    thread.start();
	  
	    thread2.setName("Thread #2");
	    thread2.start();
	   


	  }
}
