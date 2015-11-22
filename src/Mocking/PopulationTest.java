package Mocking;

import static org.junit.Assert.*;
import org.mockito.*;
import org.junit.Test;

public class PopulationTest {
	PopulationCounter population;
	
	@Test
	public void test() {
		population = Mockito.mock(PopulationCounter.class);
		Mockito.when(population.calculatePopulation()).thenReturn(1100000).thenReturn(1210000);
		
		PopulationCounter test = new PopulationCounter();
		
		int popTest, pop;
		popTest = test.calculatePopulation();
		pop = population.calculatePopulation();
		assertEquals(popTest, pop);

		popTest = test.calculatePopulation();
		pop = population.calculatePopulation();
		assertEquals(popTest, pop);
		
		Mockito.verify(population, Mockito.times(2)).calculatePopulation();
	}
}