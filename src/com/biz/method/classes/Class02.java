package com.biz.method.classes;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum; // 정수 한 개
		String strNation; // 문자열 한 개
		
		ScoreVO scoreVO;
		scoreVO = new ScoreVO();
		
		scoreVO.strName = "홍길동";
		scoreVO.intKor = 90;
		scoreVO.intEng = 88;
		scoreVO.intMath = 77;
		scoreVO.intSci = 98;
		scoreVO.intHis = 88;
		System.out.println("Kore");
		
		/*
		 * 내가 만든 ScoreVO라는 keyword 를 이용해서 sVO 라는 변수를 선언하고
		 * 
		 * 사용하기위해서 clear(초기화)하라
		 */
		
		ScoreVO sVO = new ScoreVO(); // clear
		sVO.strName = "이몽룡";
		sVO.intKor = 90;
		
		makeSum(scoreVO);

	}
	public static void makeSum(ScoreVO scoreVO) {
		System.out.println("학생이름 : " + scoreVO.strName);
		System.out.println("국어점수 : " + scoreVO.intKor);
		System.out.println("영어점수 : " + scoreVO.intEng);
		System.out.println("수학점수 : " + scoreVO.intMath);
		System.out.println("과학점수 : " + scoreVO.intSci);
		System.out.println("국사점수 : " + scoreVO.intHis);
		
	}

}
