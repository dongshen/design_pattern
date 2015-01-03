package com.tom.duck;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	} 
	
	public void display(){
		System.out.print("display...RedheadDuck\n");
	}
	
}
