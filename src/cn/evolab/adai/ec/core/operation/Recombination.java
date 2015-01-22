package cn.evolab.adai.ec.core.operation;

import cn.evolab.adai.ec.core.Population;

public abstract class Recombination<T> {
	
	public abstract Population<T> run(Population<T> population);

	public Population<T> skep() {
		return null;
	}
	
}
