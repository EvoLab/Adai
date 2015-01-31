package cn.evolab.adai.data;

import java.util.Random;

public class DoubleGaussianSampling extends SamplingBase<Double> {

	public DoubleGaussianSampling(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double rand() {
		// TODO Auto-generated method stub
		Random r = new Random();
		return r.nextGaussian();
	}

}
