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
import cn.evolab.adai.tools.Print;

public class Test {

<<<<<<< HEAD
	public void run() throws MatrixException {
		Matrix<Integer> m = new Matrix<Integer>(5, 10);
		Matrix<Integer> m2 = new Matrix<Integer>();
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				m.setElement(i, j, i*j);
			}
		}
		m2 = m.clone();
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				System.out.print(m.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");
		for(int i=0; i<m2.rowSize(); i++) {
			for(int j=0; j<m2.columnSize(); j++) {
				System.out.print(m2.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				m.setElement(i, j, 0);
			}
		}
		for(int i=0; i<m2.rowSize(); i++) {
			for(int j=0; j<m2.columnSize(); j++) {
				System.out.print(m2.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");
		
	}
	public void matrixTest() {
		Matrix<Integer> m = new Matrix<Integer>(5, 10);
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				m.setElement(i, j, i*j);
			}
		}
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				System.out.print(m.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");

		Vector<Integer> v = new Vector<Integer>();
		v = m.getColumn(9);
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"  ");
		}
		System.out.println();
		
		
	}
	public void vectorTest() {
		Vector<Integer> vector = new Vector<Integer>(10);
		for(int i=0; i<10; i++) {
			vector.set(i, i);
		}

		Vector<Integer> v2 = new Vector<Integer>();
=======
	public void run() throws Exception{
>>>>>>> origin/master
		
		// Parameter Setting
		GAParameter parameter = new GAParameter(100, 100, 0.5, 0.05);
		
		// GA Operation Setting
		GAOperation<Boolean> operation = new GAOperation<Boolean>();
		OneCutCrossover<Boolean> cros1 = new OneCutCrossover<Boolean>(parameter.getCrossoverRate());
		ReverseMutation mut1 = new ReverseMutation(parameter.getMutationRate());
		RouletteWheelSelection<Boolean> sele1 = new RouletteWheelSelection<Boolean>(parameter.getPopulationSize()-5);
		ElitistSelection<Boolean> sele2 = new ElitistSelection<Boolean>(5);
		operation.addRecombination(cros1);
		operation.addRecombination(mut1);
		operation.addPopulationUpdate(sele1);
		operation.addPopulationUpdate(sele2);
		
<<<<<<< HEAD
		v2.init(v2.size());
		for(int i=0; i<v2.size(); i++) {
			System.out.print(v2.get(i)+"  ");
		}
		System.out.println(v2.size());
				
=======
		
		// Stop Condition Setting
		StopCondition condition = new IterationsStopCondition(10000);
		
		// Problem Setting
		Function f = new F1(new double[10]);
		BinLsgoFunction evaluate = new BinLsgoFunction(f);
		
		// Run BinaryGA
		Individual<Boolean> best = new Individual<Boolean>(parameter.getIndividualSize());
		GA<Boolean> myGA = new BinaryGA(parameter.getPopulationSize(), parameter.getIndividualSize());
		best = myGA.run(evaluate, operation, condition);
		Print.pln("fitness="+best.getFitness());
>>>>>>> origin/master
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		try {
			t.run();
<<<<<<< HEAD
		} catch (MatrixException e) {
=======
		} catch (Exception e) {
>>>>>>> origin/master
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
