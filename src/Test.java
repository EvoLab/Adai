import cn.evolab.adai.ec.base.EvaluateFunction;
import cn.evolab.adai.ec.base.GAOperation;
import cn.evolab.adai.ec.core.Individual;
import cn.evolab.adai.ec.core.stop.IterationsStopCondition;
import cn.evolab.adai.ec.core.stop.StopCondition;
import cn.evolab.adai.ec.ga.BinaryGA;
import cn.evolab.adai.optimization.function.BinLsgoFunction;
import cn.evolab.adai.optimization.function.MathFunction;
import cn.evolab.adai.optimization.function.cec.*;

public class Test {

	public void run() throws Exception{
		int popSize = 1000;
		int individualSize = 1000;
		double c_rate = 0.2;
		double m_rate = 0.2;
		int maxGen = 5;
		
		// Step 0: Make a algorithm
		BinaryGA myGA = new BinaryGA(popSize, individualSize);
		
		// Step 1: Make a solution for solving the final result
		Individual<Boolean> solution = new Individual<Boolean>();
		
		// Step 2: Define a function, which be solved by the algorithm
		int dimension=10;
		Function f = new F1(new double[dimension]);
		EvaluateFunction<Boolean> evaluate = new BinLsgoFunction(f);
		
		
		// Step 4: Define some evolutionary operations for the population.
		GAOperation operation = new GAOperation();
		
		// Step 5: Confirm the stop condition
		StopCondition condition = new IterationsStopCondition(maxGen);
		
		myGA.popEvaluate(myGA.getPopulation(), solution, evaluate);
		
		
		
		for(int i=0; i<myGA.getPopulation().size(); i++) {
			System.out.println(myGA.getPopulation().getIndividual(i).getFitness()+"  ");
		}
		System.out.println("BestFitness = "+solution.getFitness());
		// Step 6: Run algorithm
		// myGA.run(condition, evaluate, operation);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		try {
			t.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void p(String str) {
		System.out.print(str);
	}
	private void pln(String str) {
		System.out.println(str);
	}

}
