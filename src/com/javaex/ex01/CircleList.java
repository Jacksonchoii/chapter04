package com.javaex.ex01;

public class CircleList {

	// 원

	// 필드
	private Circle[] cArray;
	private int crtPos;

	// 생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}

	// 메소드 getter setter 생략

	// 일반 메소드

	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos++;
	}

	public Circle get(int index) {
		return cArray[index];
	}

	public int size() {
		return crtPos;
	}

}
