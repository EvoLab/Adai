package cn.evolab.adai.ec.ga.operation;

import java.util.Random;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.ga.base.Mutation;

public class ReverseMutation extends Mutation<Boolean> {

	public ReverseMutation(double mutationRate) {
		super(mutationRate);
	}

	@Override
	public Population<Boolean> run(Population<Boolean> population) {
		Population<Boolean> offspring = new Population<Boolean>();
		Random rd = new Random();
		
		for(int i=0; i<population.size(); i++) {
			boolean sw = true;
			for(int j=0; j<population.getIndividual(i).get().size(); j++) {
				if(rd.nextDouble()<=mutationRate) {
					if(sw) {
						offspring.addIndividual(population.getIndividual(i));
						offspring.getIndividual(offspring.size()-1).get().set(j, !(offspring.getIndividual(offspring.size()-1).get().get(j)));
						sw = false;
					} else {
						offspring.getIndividual(offspring.size()-1).get().set(j, !(offspring.getIndividual(offspring.size()-1).get().get(j)));
					}
				}
			}
		}
		return offspring;
	}

}
