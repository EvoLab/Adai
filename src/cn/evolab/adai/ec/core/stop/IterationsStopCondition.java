package cn.evolab.adai.ec.core.stop;



public class IterationsStopCondition extends StopCondition {

	private int iterations;
	private boolean stop;
	public IterationsStopCondition(int iterations) {
		super();
		this.iterations = iterations;
		stop = false;
	}
	
	@Override
	public boolean stop() {
		if(super.iterations>this.iterations) {
			stop = true;
		}
		return stop;
	}
	
}
