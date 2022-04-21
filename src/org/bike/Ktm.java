//program no.03
package org.bike;

public class Ktm implements Bike{
	@Override
	public void cost() {
		System.out.println("230000");
	}
	@Override
	public void speed() {
		System.out.println("250km/h");
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.speed();
		k.cost();
	}

}
