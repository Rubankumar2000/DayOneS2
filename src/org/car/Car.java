package org.car;

public class Car {
	public void Breakname() {
		System.out.println("Apply break");
	}
	public void accelarator() {
		System.out.println("Apply Accelerator");
	}
	public void cletch() {
		System.out.println("Aplly Cletch");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.accelarator();
		c.Breakname();
		c.cletch();
	}

}
