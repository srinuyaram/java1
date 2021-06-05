package com.java;
interface Drawing{
	public void draw();
	
}

public class Lambda {
public static void main(String[] args) {
	Drawing a=()->System.out.println("hellllllo");
	a.draw();
}
}