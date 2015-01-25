package cn.evolab.adai.ec.core.operation;

import cn.evolab.adai.ec.core.Population;

public abstract class PopulationUpdate<T> {
	public abstract Population<T> run(Population<T> population, Population<T> sppring);
}
