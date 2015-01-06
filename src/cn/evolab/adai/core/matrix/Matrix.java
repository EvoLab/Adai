package cn.evolab.adai.core.matrix;

import java.util.ArrayList;

public class Matrix<T> {
	private ArrayList<Vector<T>> matrix;
	public Matrix() {
		matrix = new ArrayList<Vector<T>>();
	}
	public Matrix(int rowSize, int columnSize) {
		matrix = new ArrayList<Vector<T>>();
		for(int i=0; i<rowSize; i++) {
			Vector<T> vector = new Vector<T>(columnSize);
			matrix.add(vector);
		}
	}
	public T getElement(int row, int column) {
		return matrix.get(row).get(column);
	}
	public Vector<T> getRow(int index) {
		return matrix.get(index);
	}
	public Vector<T> getColumn(int index) {
		Vector<T> column = new Vector<T>();
		for(int i=0; i<matrix.size(); i++) {
			column.add(i, this.getElement(i, index));
		}
		return column;
	}
	
	public int rowSize() {
		return matrix.size();
	}
	public int columnSize() {
		int columnSize = 0;
		if(matrix.isEmpty()) {
			columnSize = 0;
		} else {
			columnSize = matrix.get(0).size();
		}
		return columnSize;
	}
	
	public void setElement(int row, int column, T value) {
		matrix.get(row).set(column, value);
	}
	
	// Add
	public void addRow(Vector<T> vector) throws MatrixException {
		try{
			if(vector.size()!=this.columnSize()) {
				throw new MatrixException("NewVectorSize != MatrixColumnSize");
			} else {
				matrix.add(vector);
			}
		} catch (MatrixException e) {
			throw e;
		}
	}
	public void addRow(int index, Vector<T> vector) throws MatrixException {
		try{
			if(vector.size()!=this.columnSize()) {
				throw new MatrixException("NewVectorSize != MatrixColumnSize");
			} else {
				matrix.add(index, vector);
			}
		} catch (MatrixException e) {
			throw e;
		}
	}
	public void addColumn(int index, Vector<T> vector) {
		
	}
	
	// Remove
	public void removeRow(int index) {
		
	}
	public void removeColumn(int index) {
		
	}
	public void removeAll() {
		matrix.clear();
	}
	
	public Matrix<T> clone() {
		Matrix<T> tempM = new Matrix<T>(this.rowSize(), this.columnSize());
		for(int i=0; i<this.rowSize(); i++) {
			for(int j=0; j<this.columnSize(); j++) {
				tempM.setElement(i, j, this.getElement(i, j));
			}
		}
		return tempM;
	}
	
}
