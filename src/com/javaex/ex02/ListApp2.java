package com.javaex.ex02;

public class ListApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 각각의 리스트 사용x
		// ObjList 클래스를 3번 사용

		// 사각형 관리
		Rectangle r01 = new Rectangle(3, 3);
		Rectangle r02 = new Rectangle(5, 5);

		ObjList rList = new ObjList();
		rList.add(r01);
		rList.add(r02);

		for (int i = 0; i < rList.size(); i++) {
			((Rectangle) rList.get(i)).draw();
		}

		// 원 관리
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);

		ObjList cList = new ObjList();
		cList.add(c01);
		cList.add(r02); // 단점 : 다른 도형도 추가됨

		for (int i = 0; i < cList.size(); i++) {
			((Circle) cList.get(i)).draw();
		}

	}

}
