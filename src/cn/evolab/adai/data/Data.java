package cn.evolab.adai.data;

import java.util.ArrayList;

import cn.evolab.adai.core.matrix.Matrix;
import cn.evolab.adai.core.matrix.MatrixException;
import cn.evolab.adai.core.matrix.Vector;

public abstract class Data {
	private ArrayList<Matrix<Object>> dataMatrixList;
	
	public Data() {
		this.dataMatrixList = new ArrayList<Matrix<Object>>();
	}
	
	public void addHeader(Vector<Object> header) {
		Matrix<Object> matrix = new Matrix<Object>(1, header.size());
		try {
			matrix.addRow(header);

		} catch (MatrixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dataMatrixList.add(matrix);
	}
	
	public void addData(int index, Vector<Object> data) {
		try {
			this.dataMatrixList.get(index).addRow(data);
		} catch (MatrixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Vector<Object> getDat(int index, int row) {
		return this.dataMatrixList.get(index).getRow(row);
	}
	public int getSize(int index) {
		return this.dataMatrixList.get(index).rowSize();
	}
}
