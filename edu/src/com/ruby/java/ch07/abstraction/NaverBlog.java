package com.ruby.java.ch07.abstraction;

public class NaverBlog extends ActionBlog implements Blog {
	
	public String getBlog() {
		return "Naver";
		
	}
	public void setBlog(String blg) {
		System.out.println("네이버에서 블로그를 엽니다"+ blg);
	}
	public void showNews() {
		System.out.println("뉴스아이콘 클릭후 뉴스를 엽니다.");
	}
	
	
}
