package com.javaex.ex01;

public class Circle {

	// 원 만들기

	// 필드
	public int radius;

	// 생성자
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	// 메소드 getter setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 일반 메소드
	public void draw() {
		System.out.println("원형(반지름=" + radius + ")을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
