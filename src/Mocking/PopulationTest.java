package Mocking;

import static org.junit.Assert.*;
import org.mockito.*;
import org.junit.Test;

public class PopulationTest {
	@Mock
	private PopulationCounter population = Mockito.mock(PopulationCounter.class);

	@InjectMocks
	private PopulationDifference difference = new PopulationDifference(10);

	@Test
	public void test() {
		Mockito.when(population.calculatePopulation(difference)).thenReturn(1100000).thenReturn(1210000);

		PopulationCounter test = new PopulationCounter(difference);

		int popTest, pop;
		popTest = test.calculatePopulation(difference);
		pop = population.calculatePopulation(difference);
		assertEquals(popTest, pop);

		popTest = test.calculatePopulation(difference);
		pop = population.calculatePopulation(difference);
		assertEquals(popTest, pop);

		Mockito.verify(population, Mockito.times(2)).calculatePopulation(difference);
	}
}