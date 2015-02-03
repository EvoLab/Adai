package cn.evolab.adai.core.matrix;

import java.util.Random;

public class MatrixEdit {
	public static void doubleRandom(Matrix<Double> matrix) {
		Random r = new Random();
		for(int i=0; i<matrix.rowSize(); i++) {
			for(int j=0; j<matrix.columnSize(); j++) {
				matrix.setElement(i, j, r.nextDouble());
			}
		}
	}
	public static Matrix<Double> doubleRandom(int rowSize, int columnSize) {
		Matrix<Double> matrix = new Matrix<Double>(rowSize, columnSize);
		Random r = new Random();
		for(int i=0; i<matrix.rowSize(); i++) {
			for(int j=0; j<matrix.columnSize(); j++) {
				matrix.setElement(i, j, r.nextDouble());
			}
		}
		return matrix;
	}

	public static Vector<Double> doubleMatrixMultiplyDoubleVector(Matrix<Double> matrix, Vector<Double> vector) throws MatrixException {
		Vector<Double> output = new Vector<Double>(matrix.columnSize());
		if(matrix.rowSize()!=vector.size()) {
			throw new MatrixException("This vector cannot multiply with the matrix");
		} else {
			for(int i=0; i<matrix.columnSize(); i++) {
				double sum=0.0;
				for(int j=0; j<vector.size(); j++) {
					sum += matrix.getElement(j, i)*vector.get(j);
				}
				output.set(i, sum);
			}
		}
		return output;
	}


}
