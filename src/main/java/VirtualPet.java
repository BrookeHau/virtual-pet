
public class VirtualPet {

	public int hunger;
	public int thirst = 5;
	public int boredom = 25;
//	public int tiredness;
	public int sleepiness = 55;
	public int passageOfTime = 0;
	public int happiness; 

	public VirtualPet (int hunger, int thirst, int boredom, int sleepiness, int happiness){
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

//	public int getTiredness() {
//		return tiredness;
//	}

	public int getSleepiness() {
		return sleepiness;
	}
	
//	public int tick(){
//		passageOfTime +=
//	}
	public int getHappiness(){
		return happiness; 
	}

	public void feedPet(int amountToFeedPet) {
		hunger += amountToFeedPet;
	}
	
	public void waterPet (int amountToWaterPet){
		thirst += amountToWaterPet;
	}
	
	public void letPetSleep (int amountOfSleep){
		sleepiness -= amountOfSleep;
	}
	
	public void playWithPet (int amountOfPlay){
		boredom -= amountOfPlay;
		sleepiness += (amountOfPlay/2);
	}

}
