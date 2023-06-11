package Monopoly;

public class Dice {
	public Dice(){}
	
	public static int Roll() {
		return (int)(1+Math.random()*6);
	}
}
