package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 사용 + Rectangle

		// ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		// LinkedList<Rectangle> rList = new LinkedList<Rectangle>();

		List<Rectangle> rList = new ArrayList<Rectangle>();
		// List<Rectangle> rList = new LinkedList<Rectangle>();

		Rectangle r01 = new Rectangle(3, 3);
		Rectangle r02 = new Rectangle(4, 4);

		// add()
		rList.add(r01);
		rList.add(r02);

		// get()
		Rectangle r = rList.get(0);
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		r.draw();
		System.out.println(r.toString());

		// size()
		System.out.println(rList.size());

		Rectangle r03 = new Rectangle(100, 100);
		// 위치지정 추가
		rList.add(0, r03);

		// 전체출력 get() size()
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}
		System.out.println("========toString()==============");
		System.out.println(rList.toString());

		System.out.println("==================================");
		// 삭제 remove()
		rList.remove(0);

		// 전체출력 get() size()
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("============================");
		rList.remove(r02);
		// 전체출력 get() size()
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("==원 관리=================================");

		/////////////////////////////////////////////////////////////////
		// 원
		// ArrayList<Circle> cList = new ArrayList<Circle>();
		LinkedList<Circle> cList = new LinkedList<Circle>();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(500);

		cList.add(c01);
		cList.add(c02);
		// cList.add(r01); 사각형 사용X

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

	}

}
