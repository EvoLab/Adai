package cn.evolab.adai.core.matrix;

import java.util.Random;

import cn.evolab.adai.math.STDEV;

public class VectorEdit {
	
	public static void booleanRandom(Vector<Boolean> vector) {
		Random r = new Random();
		for(int i=0; i<vector.size(); i++) {
			vector.set(i, r.nextBoolean());
		}
	}
	public static void integerRandom(Vector<Integer> vector, int range) {
		Random r = new Random();
		for(int i=0; i<vector.size(); i++) {
			vector.set(i, r.nextInt(range));
		}
	}
	public static void doubleRandom(Vector<Double> vector) {
		Random r = new Random();
		for(int i=0; i<vector.size(); i++) {
			vector.set(i, r.nextDouble());
		}
	}
	public static Vector<Double> doubleRandom(int size) {
		Vector<Double> vector = new Vector<Double>(size);
		Random r = new Random();
		for(int i=0; i<vector.size(); i++) {
			vector.set(i, r.nextDouble());
		}
		return vector;
	}
	public static void doubleRandom(Vector<Double> vector, double range) {
		Random r = new Random();
		for(int i=0; i<vector.size(); i++) {
			vector.set(i, r.nextDouble()*range);
		}
	}
	
	
	public static double booleanToDouble(Vector<Boolean> vector) {
		// Left value is the high position: [1 0 0] = 4
		double tempValue = 0;
		for(int i=0; i<vector.size(); i++) {
			if(vector.get(i)) {
				tempValue += (double)Math.pow(2, vector.size()-1-i);
			}
		}

		return tempValue;
	}
	public static Vector<Boolean> integerToBoolean(int vectorSize, int value) {
		Vector<Boolean> tempVector = new Vector<Boolean>(vectorSize);
		String tempString = Integer.toBinaryString(value);
		for(int i=0; i<vectorSize; i++) {
			tempVector.set(i, false);
		}
		int tempId=vectorSize-1;
		for(int i=tempString.length()-1; i>=0; i--) {
			if(tempString.charAt(i)=='1') {
				tempVector.set(tempId, true);
			}
			tempId--;
		}
		return tempVector;
	}
	public static Vector<Double> doubleVectorMinusDoubleVector(Vector<Double> a, Vector<Double> b) throws VectorException {
		Vector<Double> output = new Vector<Double>(a.size());
		
		if(a.size()!=b.size()) {
			throw new VectorException("Vector a cannot minus b");
		} else {
			for(int i=0; i<a.size(); i++) {
				output.set(i, (a.get(i)-b.get(i)) );
			}
		}		
		return output;
	}
	public static Vector<Double> doubleVectorMultiplyDoubleValue(Vector<Double> vector, Double value) {
		Vector<Double> output = new Vector<Double>(vector.size());
		for(int i=0; i<vector.size(); i++) {
			output.set(i, (vector.get(i)*value) );
		}
		return output;
	}
	public static double doubleSTDEV(Vector<Double> a, Vector<Double> b)  throws VectorException{
		return STDEV.run(a, b);
	}
	
}
