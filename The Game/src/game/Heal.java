package game;

public class Heal extends Spell implements TargetsCreature {
	
	String color;//This is saying that color is a string.
	String manufacturer;//This is saying that manufacturer is a string.
	int maxCapacity;//This is saying that maxCapacity is a number.
	int currentCapacity;//This is saying that currentCapacity is a number.
	
	public Heal(String c, String m, int mc) {
			System.out.println("A new kettle has been created and it's specifications are listed below:");//This is saying to print out.
			this.color = c;//This is saying that color can also be known as "c" in a variable.
			this.manufacturer = m;//This is saying that manufacturer can also be known as "m" in a variable.
			this.maxCapacity = mc;//This is saying that max capacity can also be known as "mc" in a variable.
			this.currentCapacity =0;//This is saying the current capacity should be 0.
	}
	
	public void fillup(int amount){//This is the function called "fillup".
	currentCapacity += amount;//This is saying to add the amount to the current capacity.
	}
	
	public void pour() {
	if (currentCapacity >= 50) {//This is checking if the current capacity is greater than or equal to 50.
		currentCapacity -= 50;//This is saying to take off 50 if it is.
	}
	else {//This is saying that if not, or otherwise.
		System.out.println("There is not enough water for a cup.");//Then do this, which is display an error message.
	}
	}
	
	public String toString() {//This is the string.
		return color + " " + manufacturer + " " + currentCapacity + " " + maxCapacity;//This returns the color of the kettle, followed by the manufacturer, current and then max capacity.
	}
	
}