package cn.evolab.adai.optimization.function;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.core.matrix.VectorEdit;
import cn.evolab.adai.ec.core.FitnessFunction;
import cn.evolab.adai.optimization.function.cec.Function;

public abstract class LsgoFunction<T> extends FitnessFunction<T>{
	protected Function f;
	public LsgoFunction(Function f) {
		this.f = f;
	}
	public double doubleCompute(Vector<Double> x) {
		double dx[] = new double[f.getDimension()];
		for(int i=0; i<f.getDimension(); i++) {
			dx[i] = f.getMin() + (f.getMax() - f.getMin()) * x.get(i);
		}
		return f.compute(dx);
	}
	public double dobuleCompute(double[] x) {
		double dx[] = new double[f.getDimension()];
		for(int i=0; i<f.getDimension(); i++) {
			dx[i] = f.getMin() + (f.getMax() - f.getMin()) * x[i];
		}
		return f.compute(x);
	}
	public double binCompute(Vector<Boolean> x) {
		double dx[] = new double[f.getDimension()];
		int range = x.size()/f.getDimension();
		int max = (int) (Math.pow(2, range)-1);
		
		int s=0;
		int t=range-1;
		for(int i=0; i<f.getDimension(); i++) {
			Vector<Boolean> temp = x.subVector(s, t);
			double ix = VectorEdit.booleanToDouble(temp);

			dx[i] = (double)ix/(double)max;
			s = t+1;
			t = s+range-1;

		}
		System.out.println();

		return dobuleCompute(dx);
	}
	public double intCompute(Vector<Integer> x, int range) {
		double dx[] = new double[f.getDimension()];
		for(int i=0; i<f.getDimension(); i++) {
			dx[i] = (double)(x.get(i))/(double)range;
		}
		return dobuleCompute(dx);
	}
}
