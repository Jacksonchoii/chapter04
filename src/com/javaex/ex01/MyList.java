package com.javaex.ex01;

public class MyList<T> {

	// 필드
		private T[] oArray; // 배열을 담는 주소만 생김
		private int crtPos; // 현재 포지션값 예시

		// 생성자
		public MyList() {
			oArray = (T[])(new Object[3]);
			crtPos = 0; // 초기값 0으로 세팅 --> 0번째방
		}

		// 메소드 getter setter --> 필요없음

		// 메소드 일반

		public void add(T o) {
			oArray[crtPos] = o;
			crtPos++; // 증감식
		}

		public T get(int index) {
			return oArray[index];
		}

		public int size() {
			return crtPos;
		}
		
		
		
}
