package cn.evolab.adai.core.matrix;

import java.util.Random;

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
}
