import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Pet's Name");
		String petName = input.nextLine();

		VirtualPet startInfo = new VirtualPet(10, 25, 5, 55, 20);
		System.out.println("Your pet is " + petName + " and his/her information is the following:");
		System.out.println("Hunger level is: " + startInfo.getHunger());
		System.out.println("Thirst level is: " + startInfo.getThirst());
		System.out.println("Boredom level is: " + startInfo.getBoredom());
		System.out.println("Sleepiness level is: " + startInfo.getSleepiness());
		System.out.println("Happiness level is: " + startInfo.getHappiness());

		System.out.println("What would you like to do?");
		System.out.println("1. Feed your pet");
		System.out.println("2. Water your pet");
		System.out.println("3. Play with your pet");
		System.out.println("4. Let your pet sleep");
		System.out.println("5. Do nothing");




	}

}
