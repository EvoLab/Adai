package cn.evolab.adai.ec.core;

import java.util.ArrayList;

public class Population<T> {
	
	private ArrayList< Individual<T> > population;
	
	public Population() {
		population = new ArrayList< Individual<T> >();
	}
	public Population(int popSize) {
		population = new ArrayList< Individual<T> >();
		for(int i=0; i<popSize; i++) {
			Individual<T> individual = new Individual<T>();
			population.add(individual);			
		}
	}
	public Population(int popSize, int individualSize) {
		population = new ArrayList< Individual<T> >();
		for(int i=0; i<popSize; i++) {
			Individual<T> individual = new Individual<T>(individualSize);
			population.add(individual);			
		}
	}
		
	public void addIndividual(Individual<T> individual) {
		population.add(individual);
	}
	public void setIndividual(int index, Individual<T> individual) {
		population.set(index, individual);
	}
	public Individual<T> getIndividual(int index) {
		return population.get(index);
	}
	public void removeIndividual(int index) {
		population.remove(index);
	}
	
	public int size() {
		return population.size();
	}
	
	public ArrayList< Individual<T> > get() {
		return population;
	}
	@Override
	public Population<T> clone() {
		Population<T> pop = new Population<T>();
		for(int i=0; i<population.size(); i++) {
			pop.addIndividual(this.getIndividual(i).clone());
		}
		return pop;
	}
	
	public Population<T> subPopulation(int fromIndex, int toIndex) {
		Population<T> pop = new Population<T>();
		for(int i=fromIndex; i<=toIndex; i++) {
			pop.addIndividual(this.getIndividual(i).clone());
		}
		return pop;
	}
	
	public void remove(int index) {
		this.population.remove(index);
	}
	public void clear() {
		this.population.clear();
	}
	
	public void addPopulation(Population<T> newPopulation) {
		for(int i=0; i<newPopulation.size(); i++) {
			this.addIndividual(newPopulation.getIndividual(i).clone());
		}
	}
}
