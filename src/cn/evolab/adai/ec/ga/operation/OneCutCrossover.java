package cn.evolab.adai.ec.ga.operation;

import java.util.Random;
import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.ga.base.Crossover;

public class OneCutCrossover<T> extends Crossover<T> {

	public OneCutCrossover(double crossoverRate) {
		super(crossoverRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Population<T> run(Population<T> population) {
		
		Population<T> offspring = new Population<T>();
		
		offspring = super.selectForCrossover(population);

		int id=2;
		Random rd = new Random();
		
		while (id<=offspring.size()) {
			
			int pos = rd.nextInt(offspring.getIndividual(id-2).get().size()-1)+1;
			for(int i=pos; i<offspring.getIndividual(id-2).get().size(); i++) {
				T temp;
				temp = offspring.getIndividual(id-2).get().get(i);
				offspring.getIndividual(id-2).get().set(i, offspring.getIndividual(id-1).get().get(i));
				offspring.getIndividual(id-1).get().set(i, temp);
			}
			
			id+=2;
			
		}
		return offspring;
	}


}
