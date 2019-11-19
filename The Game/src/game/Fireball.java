package game;

public class Fireball extends Spell implements TargetsLocation {

	int maxMana;//This is saying that maxCapacity is a number.
	int currentMana;//This is saying that currentCapacity is a number.
	
	public Fireball(String c, String m, int mc) {
			System.out.println("A new kettle has been created and it's specifications are listed below:");//This is saying to print out.
			this.maxMana = mc;//This is saying that max capacity can also be known as "mc" in a variable.
			this.currentMana =0;//This is saying the current capacity should be 0.
	}
	
	public void fillup(int amount){//This is the function called "fillup".
	currentMana += amount;//This is saying to add the amount to the current capacity.
	}
	
	public void useMana() {
	if (currentMana >= 50) {//This is checking if the current capacity is greater than or equal to 50.
		currentMana -= 50;//This is saying to take off 50 if it is.
	}
	else {//This is saying that if not, or otherwise.
		System.out.println("There is not enough water for a cup.");//Then do this, which is display an error message.
	}
	}
	
	public String toString() {//This is the string.
		return currentMana + " " + maxMana;//This returns the color of the kettle, followed by the manufacturer, current and then max capacity.
	}
	
}