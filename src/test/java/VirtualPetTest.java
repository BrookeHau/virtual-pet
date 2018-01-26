
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldIncreaseHungerBy50() {
		VirtualPet underTest = new VirtualPet();
		underTest.feedPet(75);
		int hunger = underTest.getHunger();
		Assert.assertEquals(85, hunger);
	}

}
