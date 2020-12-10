package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 과제
		// 사각형은 사각형대로 -- 기존
		// 원은 원대로 -- 추가
		// 삼각형은 삼각형대로 -- 추가

		// 사각형 관리
		System.out.println("====사각형관리====");
		RectList rList = new RectList();

		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(10, 10);

		rList.add(r01);
		rList.add(r02);

		Rectangle r100 = rList.get(0);
		r100.draw();

		for(int i=0; i<rList.size(); i++) {
			/*
			Rectangle r = rList.get(i);
			r.draw();
			*/
			rList.get(i).draw(); // 같은 표현
		}
		
		
		System.out.println("사각형" + rList.size() + "개");

		// 원형 관리
		System.out.println("====원형관리====");

		CircleList cList = new CircleList();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);

		cList.add(c01);
		cList.add(c02);

		Circle c100 = cList.get(1);
		c100.draw();

		System.out.println("원형" + cList.size() + "개");

		// 삼각형 관리
		System.out.println("====삼각형관리====");

		TriangleList tList = new TriangleList();

		Triangle t01 = new Triangle(7, 7);
		Triangle t02 = new Triangle(8, 10);
		Triangle t03 = new Triangle(70, 30);

		tList.add(t01);
		tList.add(t02);
		tList.add(t03);

		Triangle t100 = tList.get(0);
		t100.draw();

		System.out.println("삼각형" + tList.size() + "개");

	}

}
