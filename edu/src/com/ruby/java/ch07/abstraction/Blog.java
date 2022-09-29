package com.ruby.java.ch07.abstraction;

public interface Blog {

	public static final int Min_SIZE =1;
	public static final int MAX_SIZE =2222222;
	
	public abstract String getBlog();
	public abstract void setBlog(String blg);
	
	
	public static void getConnection() {
		System.out.println("network에 연결합니다");
	}
}
