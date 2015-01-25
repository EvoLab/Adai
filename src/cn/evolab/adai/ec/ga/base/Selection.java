package cn.evolab.adai.ec.ga.base;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.core.operation.PopulationUpdate;

public abstract class Selection<T> extends PopulationUpdate<T> {
	protected Population<T> nextPopulation;
	public Selection(int nextPopulationSize) {
		this.nextPopulation = new Population<T>(nextPopulationSize);
	}
}
