package com.fbbot.demo;

public class Squash {
	private static final String CONFLICT = "conflict";
	private static final String RESOLVING = "RESOLVING";
	
	public static String conflict() {
		return CONFLICT;
	}
	
	public String resolving() {
		return RESOLVING;
	}
}
