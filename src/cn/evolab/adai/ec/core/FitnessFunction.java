package cn.evolab.adai.ec.core;


public abstract class FitnessFunction<T> {
	public abstract double getMinFitness(Individual<T> individual);
}
