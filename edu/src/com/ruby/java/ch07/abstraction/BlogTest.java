package com.ruby.java.ch07.abstraction;

import java.util.ArrayList;
public class BlogTest {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>();
	
		
		NaverBlog naver = new NaverBlog();
		TistoryBlog tistory = new TistoryBlog();
		
		System.out.println("블로그 최소 글자 크기 : "+ Blog.Min_SIZE);
		System.out.println("블로그 최대 글자 크기 : "+ Blog.MAX_SIZE);
		
		System.out.println("naver :" + naver);
		
//		naver.getBlog();
//		naver.setBlog(" 환영합니다!");
//		naver.showNews();
//		naver.showBlog();
//		naver.writeBlog();
//		
//
//	
//		tistory.getBlog();
//		tistory.setBlog(" 반갑습니다!");
//		tistory.showAd();
//		tistory.fileDownload();
//		tistory.fileUpload();
//		
	}

}
