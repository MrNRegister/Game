package game;

public class Repair extends Spell implements TargetsItem {
	
	String colour;
	String manufacturer;
	int maxBreadCapacity;
	int currentBreadCapacity;
	String breadDescription;
	
	public Repair(String c, String m, int mc) {
		System.out.println("A new toaster has been created");
		this.colour = c;
		this.manufacturer = m;
		this.maxBreadCapacity = mc;
		this.currentBreadCapacity = 0;
	}
	
	public void insertBread(int amount) {
		if(currentBreadCapacity + amount <= maxBreadCapacity) {
			currentBreadCapacity += amount;
			breadDescription = "bread";
			System.out.println("You inserted some bread.");
			} else {
				System.out.println("Not enough room for that amount of bread.");
				
			}
		}
	
	public String toString() {
		return colour + " " + manufacturer + " " + currentBreadCapacity + "/" + maxBreadCapacity;
	}
	
	public void removeToast (int amount) {
		if(currentBreadCapacity >= amount) {
		currentBreadCapacity -= amount;
		System.out.println("You took out some " + breadDescription + " from the toaster." );
		} else {
			System.out.println("There isn't that much bread in the toaster.");
		}
	}
	
	
	public void pressSwitch() {
		super.pressSwitch();
		if(isSwitchedOn() && currentBreadCapacity > 0) {
			breadDescription = "toast";
			System.out.println("Your bread is being toasted!");
			super.pressSwitch();
		}
	}
	

}