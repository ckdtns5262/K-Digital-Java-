package com.ruby.java.ch07.abstraction;

public class TistoryBlog implements Blog, WorkFile {

	public String getBlog() {
		return "Tistory";
	}
	public void setBlog(String blg) {
		System.out.println("Tistory에서 블로그를 엽니다" + blg);
	}
	public void showAd() {
		System.out.println("1초후 광고가 보여집니다");
	}
	
	public void fileUpload() {
		System.out.println("파일을 업로드합니다");
	}
	public void fileDownload() {
		System.out.println("파일을 다운로드합니다");
	}
}
