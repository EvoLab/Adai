package cn.evolab.adai.ec.base;

import cn.evolab.adai.ec.core.Individual;

public abstract class EvaluateFunction<T> {
	public abstract double getMinFitness(Individual<T> individual);
}
