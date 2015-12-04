package Mocking;

public class PopulationCounter { //implements PopCount {
	
	private int population = 1000000;
	private PopulationDifference difference;
	
	public PopulationCounter(){
		this(new PopulationDifference());
	}
	
	public PopulationCounter(PopulationDifference difference){
		this.difference = difference;
	}

	public void setPopulation(int i) {
		population = i;
	}

	public int calculatePopulation(PopulationDifference difference) {
		population = population + difference.getDifference(population);
		return population;
	}
}
