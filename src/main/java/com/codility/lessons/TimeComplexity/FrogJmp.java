package com.codility.lessons.TimeComplexity;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new FrogJmp().solution2(10, 85, 30));
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);

	}


	public int solution(int X, int Y, int D) {
		// write your code in Java SE 7
		int wholeValue;
		if(X==Y)
			return 0;
		wholeValue=(int) Math.ceil((double)(Y-X)/D);
		return wholeValue;


	}

}
