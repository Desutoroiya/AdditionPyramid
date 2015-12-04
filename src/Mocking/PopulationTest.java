package Mocking;

import org.mockito.*;
import org.junit.Test;

public class PopulationTest {
	@Mock
	private PopulationDifference difference = Mockito.mock(PopulationDifference.class);

	@InjectMocks
	private PopulationCounter population = new PopulationCounter(difference);

	@Test
	public void test() {
		Mockito.when(population.calculatePopulation()).thenReturn(1100000);

		population.calculatePopulation();

		Mockito.verify(difference).calculateDifference();
	}
}