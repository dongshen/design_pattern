package com.tom.duck;

public class MallardDuck extends  Duck  {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display(){
		System.out.print("display...MallardDuck\n");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.print("display...MallardDuck\n");
		
	}
	

}
