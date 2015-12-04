package Mocking;

public class PopulationDifference {
	private int num;
	
	public PopulationDifference(){
		this(10);
	}

	public PopulationDifference(int num){
		this.num = num;
	}

	public int getDifference(int population) {
		return population / num;
	}

}
