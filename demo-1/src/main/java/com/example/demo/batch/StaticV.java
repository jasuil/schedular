package com.example.demo.batch;


public final class StaticV {

	private static int sessionV = 3;

	public static int getSessionV() {
		return sessionV;
	}

	public static void setSessionV(int sessionV) {
		StaticV.sessionV = sessionV;
	}
	
	public static void minus() {
		StaticV.sessionV--;
	}
	
	public static void plus() {
		StaticV.sessionV++;
	}
}
