package com.java;
interface Drawing{
	public void draw(int a);
	
}

public class Lambda {
public static void main(String[] args) {
	/*Drawing a=()->System.out.println("hellllllo");
	a.draw();*/
	Drawing d1=(a)->System.out.println(a);
	d1.draw(10);
}
}