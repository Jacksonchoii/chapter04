package com.javaex.ex02;

public class Triangle {

	// 삼각형 만들기

	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 메소드 getter setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 일반메소드

	public void draw() {
		System.out.println("삼각형(가로=" + width + ", 세로=" + height + ")을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
}
