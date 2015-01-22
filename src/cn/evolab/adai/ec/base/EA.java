package cn.evolab.adai.ec.base;

import cn.evolab.adai.ec.core.Individual;
import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.core.stop.StopCondition;

public abstract class EA<T> {
	protected Population<T> population;
	protected Individual<T> best;
	public EA(int populationSize, int individualSize) {
		population = new Population<T>(populationSize, individualSize);
		best = new Individual<T>(individualSize);
		popInitialization(population);
	}

	public abstract void popInitialization(Population<T> population);
	public void populationUpdate(Population<T> population) {
		this.population = population.clone();
	}
	public Population<T> getPopulation() {
		return this.population;
	}
	public Individual<T> getBestIndividual() {
		return this.best;
	}
	
	
	public Individual<T> bestIndividualUpdate(Population<T> population, Individual<T> best) {
		for(int i=0; i<population.size(); i++) {
			if(population.getIndividual(i).getFitness()<best.getFitness()) {
				best = population.getIndividual(i).clone();
			}
		}
		return best;
	}
	
	public Individual<T> popEvaluate(Population<T> population, Individual<T> best, EvaluateFunction<T> evaluate) {
		for(int i=0; i<population.size(); i++) {
			population.getIndividual(i).setFitness(evaluate.getMinFitness(population.getIndividual(i)));
		}
		return bestIndividualUpdate(population, best);
	}
	
	public Population<T> offspringEvolution(Population<T> population, EAOperation<T> operation) {
		Population<T>  offspring = new Population<T>();
		offspring = operation.generateOffspring(population);
		return offspring;
	}
	
	public Individual<T> run(StopCondition condition, EvaluateFunction<T> evaluate, EAOperation<T> operation) {
		// Initialization
		Population<T> offspring = new Population<T>();
		condition.init();
		// Generation 0
		best = this.popEvaluate(population, best, evaluate);
		
		// Evolution until stop
		while (!condition.stop()) {
			offspring = this.offspringEvolution(population, operation);
			best = this.popEvaluate(offspring, best, evaluate);
			population = operation.update(population, offspring);
		}
		
		// Return the best individual
		return best;
	}
}
