
public class VirtualPet {

	public int hunger;
	public int thirst = 15;
	public int boredom;
	public int tiredness;
	public int sleepiness;

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getTiredness() {
		return tiredness;
	}

	public int getSleepiness() {
		return sleepiness;
	}

	public void feedPet(int amountToFeedPet) {
		hunger += amountToFeedPet;
	}

}
