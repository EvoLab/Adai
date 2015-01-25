package cn.evolab.adai.ec.core.operation;

import java.util.ArrayList;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.tools.Print;

public abstract class EAOperation<T> {
	private Population<T> offspring;
	private Population<T> nextPopulation;
	protected  ArrayList<Recombination<T>> OperationList;
	protected ArrayList<PopulationUpdate<T>> PopUpdateList;
	
	public EAOperation() {
		OperationList = new ArrayList<Recombination<T>>();
		PopUpdateList = new ArrayList<PopulationUpdate<T>>();
		offspring = new Population<T>();
		nextPopulation = new Population<T>();
	}
	public void addRecombination(Recombination<T> recombination) {
		OperationList.add(recombination);
	}
	public void removeRecombination(Recombination<T> recombination) {
		OperationList.remove(recombination);
	}
	public void removeRecombination(int index) {
		OperationList.remove(index);		
	}
	public void removeAllRecombination() {
		OperationList.clear();
	}
	
	public void addPopulationUpdate(PopulationUpdate<T> popUpdate) {
		PopUpdateList.add(popUpdate);
	}
	public void removePopulationUpdate(PopulationUpdate<T> popUpdate) {
		PopUpdateList.remove(popUpdate);
	}
	public void removePopulationUpdate(int index) {
		PopUpdateList.remove(index);		
	}
	public void removeAllPopulationUpdate() {
		PopUpdateList.clear();
	}
	
	public Population<T> runRecombination(Population<T> population) {
		for(int i=0; i<OperationList.size(); i++) {
			offspring.addPopulation(this.OperationList.get(i).run(population));
		}
		return offspring;
	}
	public Population<T>  runPopulationUpdate(Population<T> population, Population<T> offspring) {
		for(int i=0; i<PopUpdateList.size(); i++) {
			nextPopulation.addPopulation(this.PopUpdateList.get(i).run(population, offspring));
		}
		return nextPopulation;
	}
	
}
