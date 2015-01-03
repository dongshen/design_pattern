package com.tom.Starbuzz;

public abstract class Beverage {
	protected String description;

	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;

	public Beverage() {
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean isMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean isWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
