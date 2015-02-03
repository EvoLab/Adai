package cn.evolab.adai.ec.core.init;

import java.util.Random;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.ec.core.Individual;

public class PermutationInitialization extends Initialization<Integer> {
	public PermutationInitialization() {
		super();
	}
	@Override
	public void individualInit(Individual<Integer> individual) {
		Random r = new Random();
		Vector<Integer> vector = new Vector<Integer>(individual.get().size());
		for(int i=0; i<individual.get().size(); i++) {
			vector.set(i, i);
		}
		for(int i=0; i<individual.get().size(); i++) {
			int a = r.nextInt(individual.get().size());
			int b = r.nextInt(individual.get().size());
			int temp = vector.get(a);
			vector.set(a, vector.get(b));
			vector.set(b, temp);
		}
		individual.set(vector);
	}
}
