package com.test;

public class FeedingSchedule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, j = 0;
		OUTER: for(int i=0; i<3; )
		INNER: do {
		i++; x++;
		if(x > 10) break INNER;
		x += 4;
		j++;
		} while(j <= 2);
		System.out.println(x);
		}

}
