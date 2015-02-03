package cn.evolab.adai.ec.core.stop;


public class IterationsStopCondition extends StopCondition {

	private int maxIterations;
	private boolean stop;
	public IterationsStopCondition(int iterations) {
		super();
		this.maxIterations = iterations;
		stop = false;
	}
	
	@Override
	public boolean stop() {
		if(super.iterations+1>this.maxIterations) {
			stop = true;
		}
		return stop;
	}
	
}
