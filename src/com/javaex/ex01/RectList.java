package com.javaex.ex01;

public class RectList {

	// 필드
	private Rectangle[] rArray; // 배열을 담는 주소만 생김
	private int crtPos; // 현재 포지션값 예시

	// 생성자
	public RectList() {
		rArray = new Rectangle[3];
		crtPos = 0; // 초기값 0으로 세팅 --> 0번째방
	}

	// 메소드 getter setter --> 필요없음

	// 메소드 일반

	public void add(Rectangle r) {
		rArray[crtPos] = r;
		crtPos++; // 증감식
	}

	public Rectangle get(int index) {
		return rArray[index];
	}

	public int size() {
		return crtPos;
	}

}
