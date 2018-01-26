
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldIncreaseHungerBy5() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5, 5);
		underTest.feedPet(5);
		int hunger = underTest.getHunger();
		Assert.assertEquals(10, hunger);
	}
	
	@Test
	public void shouldIncreaseThirstBy15() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5, 5);
		underTest.waterPet(15);
		int thirst = underTest.getThirst();
		Assert.assertEquals(20, thirst);
	}
	
	@Test
	public void shouldDecreaseBoredomBy16() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5, 5);
		underTest.playWithPet(4);
		int boredom = underTest.getBoredom();
		int sleepiness = underTest.getSleepiness();
		Assert.assertEquals(1, boredom);
		Assert.assertEquals(7, sleepiness);
	}
	
	@Test
	public void shouldDecreaseSleepinessBy23() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5, 5);
		underTest.letPetSleep(2);
		int sleepiness = underTest.getSleepiness();
		Assert.assertEquals(3, sleepiness);
	}
	
	

}
