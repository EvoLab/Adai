package cn.evolab.adai.ec.core.stop;

public abstract class StopCondition {
	
	// Initialization
	protected int iterations, offspringNums;
	protected double bestFitness, startTime, computationTime;
	public StopCondition() {
		iterations = 0;
		offspringNums = 0;
		bestFitness = 0.0;
		startTime = System.currentTimeMillis();
		computationTime = 0.0;
	}
	public void init() {
		iterations = 0;
		offspringNums = 0;
		bestFitness = 0.0;
		startTime = System.currentTimeMillis();
		computationTime = 0.0;
	}
	public void update(int offspringSize, double bestFitness) {
		iterations++;
		this.bestFitness=bestFitness;
		this.computationTime = System.currentTimeMillis() - startTime;
	}

	public abstract boolean stop();

}
