package Mocking;

public class PopulationCounter {

	private int population = 1000000;
	private PopulationDifference difference;

	public PopulationCounter() {
		this(new PopulationDifference());
	}

	public PopulationCounter(PopulationDifference difference) {
		this.difference = difference;
	}

	public void setPopulation(int i) {
		population = i;
	}

	public int calculatePopulation() {
		difference.setPopulation(population);
		population = population + difference.calculateDifference();
		return population;
	}
}
