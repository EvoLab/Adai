package cn.evolab.adai.ec.ga;

public class GAParameter {
	private int populationSize;
	private int individualSize;
	private double crossoverRate;
	private double mutationRate;
	public GAParameter(int populationSize, int individualSize, double crossoverRate, double mutationRate) {
		this.populationSize = populationSize;
		this.individualSize = individualSize;
		this.crossoverRate = crossoverRate;
		this.mutationRate = mutationRate;
	}
	public int getPopulationSize() {
		return populationSize;
	}
	public void setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
	}
	public int getIndividualSize() {
		return individualSize;
	}
	public void setIndividualSize(int individualSize) {
		this.individualSize = individualSize;
	}
	public double getCrossoverRate() {
		return crossoverRate;
	}
	public void setCrossoverRate(double crossoverRate) {
		this.crossoverRate = crossoverRate;
	}
	public double getMutationRate() {
		return mutationRate;
	}
	public void setMutationRate(double mutationRate) {
		this.mutationRate = mutationRate;
	}
}
