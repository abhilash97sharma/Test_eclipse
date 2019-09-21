package com.beans;

public class Sample_Prog2 {

	private int i1;
	private String s1;

	private Sample_Prog2() {
		System.out.println("Private constructer called...");
	}
	
	private Sample_Prog2(int i, String s) {
		this.i1 = i;
		this.s1 = s;
	}

}
