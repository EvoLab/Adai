package cn.evolab.adai.ec.core.stop;


public class CompTimeStopCondition extends StopCondition {
	double computationTime;
	private boolean stop;

	public CompTimeStopCondition(double computationTime) {
		super();
		this.computationTime = computationTime;
		stop = false;
	}
	@Override
	public boolean stop() {
		if(super.computationTime>this.computationTime) {
			stop = true;
		}
		return stop;
	}

}
