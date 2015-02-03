package cn.evolab.adai.ec.core.stop;


public class OffspringNumsStopCondition extends StopCondition {
	
	private int offspringNums;
	private boolean stop;
	
	public OffspringNumsStopCondition(int offspringNums) {
		super();
		this.offspringNums = offspringNums;
		stop = false;
	}

	@Override
	public boolean stop() {
		if(super.offspringNums>this.offspringNums) {
			stop = true;
		}
		return stop;
	}

}
