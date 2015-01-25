package cn.evolab.adai.tools;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.ec.core.Individual;
import cn.evolab.adai.ec.core.Population;

public class Print {
	public static <T> void vector(Vector<T> vector) {
		for(int i=0; i<vector.size(); i++) {
			System.out.print(vector.get(i) + "\t");
		}
		System.out.println();
	}
	public static <T> void individual(Individual<T> individual) {
		for(int i=0; i<individual.get().size(); i++) {
			System.out.print(individual.get().get(i) + "\t");
		}
		System.out.println(": fitness = "+individual.getFitness());
	}
	public static <T> void population(Population<T> population) {
		for(int i=0; i<population.size(); i++) {
			System.out.print(i+":\t");
			Print.individual(population.getIndividual(i));
		}
	}
	public static void p(String str) {
		System.out.print(str);
	}
	public static void pln(String str) {
		System.out.println(str);
	}
	public static <T> void p(T list[]) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+"\t");
		}
		System.out.println();
	}
	public static <T> void pln(T list[]) {
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]+"\t");
		}
	}
	
}
