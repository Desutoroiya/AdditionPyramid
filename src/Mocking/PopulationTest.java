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
	
	
	
//	@Test
//	public void test() {
//		Integer first,mockedFirst;
//		Counter count = new Counter();
//		Counter mockedCounter = mock(Counter.class);
//		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);
//		first = count.getValue();
//		mockedFirst = mockedCounter.getValue();
//		assertEquals("Wronge Answer !",first , mockedFirst);
//		
//		first = count.getValue();
//		mockedFirst = mockedCounter.getValue();
//		assertEquals("Wronge Answer !",first , mockedFirst);
//		
//		first = count.getValue();
//		mockedFirst = mockedCounter.getValue();
//		
//		verify(mockedCounter,atLeast(4)).getValue();
//		
//		assertEquals("Wronge Answer !",first , mockedFirst);
//	}
}
