package com.tom.duck;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	} 
	
	public void display(){
		System.out.print("display...RubberDuck\n");
	} 
	
}
