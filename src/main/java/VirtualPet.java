
public class VirtualPet {

	public int hunger;
	public int thirst;
	public int boredom;
	public int sleepiness;
	public int happiness;
	public int tick;

	public VirtualPet(int hunger, int thirst, int boredom, int sleepiness, int happiness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.sleepiness = sleepiness;
		this.happiness = happiness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getSleepiness() {
		return sleepiness;
	}

	public int getHappiness() {
		return happiness;
	}

	public void feedPet(int amountToFeedPet) {
		hunger += amountToFeedPet;
		thirst += (amountToFeedPet + 1);
		sleepiness += (amountToFeedPet + 3);
	}

	public void waterPet(int amountToWaterPet) {
		thirst += amountToWaterPet;
	}

	public void letPetSleep(int amountOfSleep) {
		sleepiness -= amountOfSleep;
	}

	public void playWithPet(int amountOfPlay) {
		boredom -= amountOfPlay;
		sleepiness += (amountOfPlay - 2);
	}

	public void doNothing(int doNothingAmount) {
		hunger += doNothingAmount;
		thirst += doNothingAmount;
		boredom += (doNothingAmount * 2);
		sleepiness -= doNothingAmount;
		happiness -= (doNothingAmount + 5);
	}

	public void tick() {
		hunger += 2;
		thirst += 1;
		boredom += 3;
		sleepiness -= 2;
		happiness += 5;
	}

}
