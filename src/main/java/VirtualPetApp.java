import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome!  Enter your Pet's Name:");
		String petName = input.nextLine();

		VirtualPet myPet = new VirtualPet(4, 5, 6, 7, 10);
		System.out.println("Your pet is " + petName
				+ " and his/her information is the following \n(Note, the game will end if your pet's boredom is above 10.  Also, a new day begins after your have completed 3 tasks for your pet):");
		System.out.println("Hunger level is: " + myPet.getHunger());
		System.out.println("Thirst level is: " + myPet.getThirst());
		System.out.println("Boredom level is: " + myPet.getBoredom());
		System.out.println("Sleepiness level is: " + myPet.getSleepiness());
		System.out.println("Happiness level is: " + myPet.getHappiness());
		System.out.println();

		while (myPet.getBoredom() < 10) {
			for (int i = 0; i < 3; i++) {

				System.out.println("What would you like to do?");
				System.out.println("1. Feed your pet");
				System.out.println("2. Water your pet");
				System.out.println("3. Play with your pet");
				System.out.println("4. Let your pet sleep");
				System.out.println("5. Do nothing");
				String optionEntered = input.nextLine();

				if (optionEntered.equals("1")) {
					System.out.println("You fed " + petName);
					myPet.feedPet(2);

				}
				if (optionEntered.equals("2")) {
					System.out.println("You watered " + petName);
					myPet.waterPet(1);
				}
				if (optionEntered.equals("3")) {
					System.out.println("You played with " + petName);
					myPet.playWithPet(4);
				}
				if (optionEntered.equals("4")) {
					System.out.println("Your pet is now sleeping");
					myPet.letPetSleep(3);
				}
				if (optionEntered.equals("5")) {
					System.out.println("You did nothing, awful parenting");
					myPet.doNothing(4);
				}
				if (myPet.getBoredom() > 10) {
					System.out.println("Game over! Boredom is greater than 10");
					System.exit(0);
				}
				System.out.println();
				System.out.println("Your Pet Stats are the following: ");
				System.out.println("Hunger level is: " + myPet.getHunger());
				System.out.println("Thirst level is: " + myPet.getThirst());
				System.out.println("Boredom level is: " + myPet.getBoredom());
				System.out.println("Sleepiness level is: " + myPet.getSleepiness());
				System.out.println("Happiness level is: " + myPet.getHappiness());
				System.out.println();
			}

			System.out.println("Today is a new day");
			myPet.tick();
			System.out.println();
			System.out.println("Your Pet Stats are the following: ");
			System.out.println("Hunger level is: " + myPet.getHunger());
			System.out.println("Thirst level is: " + myPet.getThirst());
			System.out.println("Boredom level is: " + myPet.getBoredom());
			System.out.println("Sleepiness level is: " + myPet.getSleepiness());
			System.out.println("Happiness level is: " + myPet.getHappiness());
			System.out.println();
		}
		input.close();
	}

}
