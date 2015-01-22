package cn.evolab.adai.ec.base;

import cn.evolab.adai.ec.core.Population;

public abstract class EAOperation<T> {
	public abstract Population<T> generateOffspring(Population<T> population);
	public abstract Population<T> update(Population<T> population, Population<T> offspring);
}
