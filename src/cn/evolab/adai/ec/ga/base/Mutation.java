package cn.evolab.adai.ec.ga.base;

import cn.evolab.adai.ec.core.operation.Recombination;

public abstract class Mutation<T> extends Recombination<T> {
	protected double mutationRate;
	public Mutation(double mutationRate) {
		this.mutationRate = mutationRate;
	}
}
