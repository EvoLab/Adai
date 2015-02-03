package cn.evolab.adai.ec.core;

import cn.evolab.adai.core.matrix.Vector;

public class Individual<T>{
	
	private double fitness;
	private Vector<T> code;
	
	public Individual() {
		code = new Vector<T>();
		fitness=Double.MAX_VALUE;
	}
	public Individual(int size) {
		code = new Vector<T>(size);
		fitness=Double.MAX_VALUE;
	}
	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
	public double getFitness() {
		return this.fitness;
	}
	public void set(Vector<T> vector) {
		this.code = vector;
	}
	public Vector<T> get() {
		return this.code;
	}
	@Override
	public Individual<T> clone() {
		Individual<T> temp = new Individual<T>();
		temp.setFitness(this.fitness);
		temp.set(this.code.clone());
		return temp;
	}
}
