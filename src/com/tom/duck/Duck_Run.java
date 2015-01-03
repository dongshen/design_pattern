package com.tom.duck;

public class Duck_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MallardDuck...");
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.swim();
		
		System.out.println("\nRedheadDuck...");
		RedheadDuck redheadDuck = new RedheadDuck();
		redheadDuck.display();
		redheadDuck.performFly();
		redheadDuck.performQuack();
		redheadDuck.swim();
		
		
		System.out.println("\nRubberDuck...");
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.setFlyBehavior(new FlyWithWings());
		rubberDuck.performFly();
		rubberDuck.performQuack();
		rubberDuck.swim();
	}

}
