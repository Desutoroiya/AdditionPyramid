package Mocking;

public class PopulationDifference {
	private int population;

	public void setPopulation(int population) {
		this.population = population;
	}

	public int calculateDifference() {
		return population / 10;
	}

}
