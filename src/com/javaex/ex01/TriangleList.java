package com.javaex.ex01;

public class TriangleList {

	// 필드
	private Triangle[] tArray;
	private int crtPos;

	// 생성자
	public TriangleList() {
		tArray = new Triangle[3];
		crtPos = 0;
	}

	// 메소드 getter setter --> 필요없어서 안만듬

	// 메소드 일반

	public void add(Triangle t) {
		tArray[crtPos] = t;
		crtPos++;
	}

	public Triangle get(int index) {
		return tArray[index];
	}

	public int size() {
		return crtPos;
	}

}
