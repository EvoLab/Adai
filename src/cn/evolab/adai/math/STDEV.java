package cn.evolab.adai.math;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.core.matrix.VectorException;

public class STDEV {
	public static double run(Vector<Double> a, Vector<Double> b)  throws VectorException{
		double stdev = 0.0;
		if(a.size()!=b.size()) {
			throw new VectorException("Size of vector a not equal to b");
		} else {
			double sum = 0.0;
			for(int i=0; i<a.size(); i++) {
				sum += Math.pow(a.get(i)-b.get(i), 2);
			}
			stdev = Math.sqrt(sum/(double)(a.size()-1));
		}		
		return stdev;
	}
	public static double run(double[] a, double[] b) {
		double stdev = 0.0;
		double sum = 0.0;
		for(int i=0; i<a.length; i++) {
			sum += Math.pow(a[i]-b[i], 2);
		}
		stdev = Math.sqrt(sum/(double)(a.length-1));
		return stdev;
	}

}
