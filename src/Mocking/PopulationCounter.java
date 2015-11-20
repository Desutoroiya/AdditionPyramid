package Mocking;

public class PopulationCounter { //implements PopCount {
	
	private int population = 1000000;

	public void setPopulation(int i) {
		population = i;
	}

	public int calculatePopulation() {
		PopulationDifference difference = new PopulationDifference();
		population = population + difference.getDifference(population);
		return population;
	}
}
