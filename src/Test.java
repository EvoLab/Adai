import cn.evolab.adai.ec.core.Individual;
import cn.evolab.adai.ec.core.stop.IterationsStopCondition;
import cn.evolab.adai.ec.core.stop.StopCondition;
import cn.evolab.adai.ec.ga.BinaryGA;
import cn.evolab.adai.ec.ga.GAParameter;
import cn.evolab.adai.ec.ga.base.GA;
import cn.evolab.adai.ec.ga.base.GAOperation;
import cn.evolab.adai.ec.ga.operation.*;
import cn.evolab.adai.optimization.function.BinLsgoFunction;
import cn.evolab.adai.optimization.function.cec.F1;
import cn.evolab.adai.optimization.function.cec.Function;

public class Test {

	public void run() throws Exception{
		
		// Parameter Setting
		GAParameter parameter = new GAParameter(10, 5, 0.2, 0.3);
		
		// GA Operation Setting
		GAOperation<Boolean> operation = new GAOperation<Boolean>();
		OneCutCrossover<Boolean> cros1 = new OneCutCrossover<Boolean>(parameter.getCrossoverRate());
		RouletteWheelSelection<Boolean> sele = new RouletteWheelSelection<Boolean>(parameter.getPopulationSize());
		operation.addRecombination(cros1);
		operation.addPopulationUpdate(sele);
		
		// Stop Condition Setting
		StopCondition condition = new IterationsStopCondition(100);
		
		// Problem Setting
		Function f = new F1(new double[100]);
		BinLsgoFunction evaluate = new BinLsgoFunction(f);
		
		// Run BinaryGA
		Individual<Boolean> best = new Individual<Boolean>(parameter.getIndividualSize());
		GA<Boolean> myGA = new BinaryGA(parameter.getPopulationSize(), parameter.getIndividualSize());
		best = myGA.run(evaluate, operation, condition);
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
	

}
