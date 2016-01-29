package com.jsr.tutorials.data.algorithm;

public abstract class Euclid {

	// issue if u, v are not greater than 0

	static int greatestCommonDenominator(int u, int v){
		int t = 0;
		while (u > 0){
			if (u < v){
				t=u;u=v;v=t;
			}
			u = u-v;
		}
		return v;
	}

}
