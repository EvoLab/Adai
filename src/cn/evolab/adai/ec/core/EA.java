package cn.evolab.adai.ec.core;

import cn.evolab.adai.ec.core.operation.EAOperation;
import cn.evolab.adai.ec.core.stop.StopCondition;
import cn.evolab.adai.tools.Print;

public abstract class EA<T> {
	protected Population<T> population;
	protected Individual<T> best;
	public EA(int populationSize, int individualSize) {
		population = new Population<T>(populationSize, individualSize);
		best = new Individual<T>(individualSize);
		popInitialization(population);
	}

	// population initialization
	public abstract void popInitialization(Population<T> population);
	
	// update population
	public void populationUpdate(Population<T> population) {
		this.population = population.clone();
	}
	
	// get population
	public Population<T> getPopulation() {
		return this.population;
	}
	// get best individual
	public Individual<T> getBestIndividual() {
		return this.best;
	}
	
	// update the best individual
	public Individual<T> bestIndividualUpdate(Population<T> population, Individual<T> best) {
		for(int i=0; i<population.size(); i++) {
			if(population.getIndividual(i).getFitness()<best.getFitness()) {
				best = population.getIndividual(i).clone();
			}
		}
		return best;
	}
	
	// Evaluate the population, get fitness
	// Return the best individual
	public Individual<T> popEvaluate(Population<T> population, FitnessFunction<T> evaluate) {
		for(int i=0; i<population.size(); i++) {
			population.getIndividual(i).setFitness(evaluate.getMinFitness(population.getIndividual(i)));

		}
		return bestIndividualUpdate(population, best);
	}
	
	// Generate new offspring by EAOperations
	public Population<T> generatOffspring(EAOperation<T> operation, Population<T> population) {
		return operation.runRecombination(population);
	}
	
	// Update population, return nextPopulation
	public Population<T> populationUpdate(EAOperation<T> operation, Population<T> population, Population<T> offspring) {
		return operation.runPopulationUpdate(population, offspring);
	}
	
	// Run EA, return the best individual
	public Individual<T> run(FitnessFunction<T> evaluate, EAOperation<T> operation, StopCondition condition) {
		// Step 1: Initialization
		Population<T> offspring = new Population<T>();
		condition.init();
		
		// Step 2: Generation 0
		best = this.popEvaluate(population, evaluate);
		
		// Evolution until stop
		while (!condition.stop()) {
			// Generate offspring
			offspring = this.generatOffspring(operation, population);
			
			// evaluate and get fitness(minimize)
			best = this.popEvaluate(offspring, evaluate);

			// selection for the next iteration
			population = operation.runPopulationUpdate(population, offspring);
			
			// update for next generation
			condition.update(offspring.size(), best.getFitness());
			operation.init();
			Print.pln("best="+best.getFitness());
		}
		
		// Return the best individual
		return best;
	}
}
