package cn.evolab.adai.ec.ga;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.core.init.BinInitialization;
import cn.evolab.adai.ec.core.init.Initialization;
import cn.evolab.adai.ec.ga.base.GA;

public class BinaryGA extends GA<Boolean> {

	public BinaryGA(int populationSize, int individualSize) {
		super(populationSize, individualSize);
	}

	@Override
	public void popInitialization(Population<Boolean> population) {
		// TODO Auto-generated method stub
		Initialization<Boolean> init = new BinInitialization();
		init.populationInit(population);
	}


}
