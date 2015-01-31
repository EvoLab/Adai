import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.data.DoubleGaussianSampling;
import cn.evolab.adai.ml.core.SigmoidFunction;
import cn.evolab.adai.ml.model.rbm.DRBM;
import cn.evolab.adai.ml.model.rbm.DRBMParameter;
import cn.evolab.adai.tools.Print;


public class RBMTest {
	
	public void run() {
		
		int inputSize=10;
		int outputSize=3;
		
		SigmoidFunction sigmoid = new SigmoidFunction();
		DRBMParameter parameter = new DRBMParameter(inputSize, outputSize);
		DRBM model = new DRBM(parameter, sigmoid);
		DoubleGaussianSampling sample = new DoubleGaussianSampling(inputSize);
		
		double error = 100;
		while(error>0.001) {
			error = model.training(sample.random());
			Print.pln("error="+error);
		}
		/*
		Vector<Double> input = sample.random();
		double error = model.training(input);
		Print.vector(input);
		Print.matrix(parameter.getWeight());
		Print.vector(model.run(input));
		Print.pln("error="+error);
*/		
		
	}
	public static void main(String[] args) {
		RBMTest t = new RBMTest();
		try {
			t.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
