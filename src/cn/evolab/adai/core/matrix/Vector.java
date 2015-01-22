package cn.evolab.adai.core.matrix;

import java.util.ArrayList;


public class Vector<T> {
	private ArrayList<T> vector;
	
	public Vector() {
		vector = new ArrayList<T>();
	}
	public Vector(int size) {
		vector = new ArrayList<T>();
		for(int i=0; i<size; i++) {
			vector.add((T)null);
		}
	}
	
	public void add(T element) {
		vector.add(element);
	}
	public void add(int index, T element) {
		vector.add(index, element);
	}
	public void set(int index, T element) {
		vector.set(index, element);
	}
	public void init(int size) {
		vector.clear();
		for(int i=0; i<size; i++) {
			vector.add(i, (T)null);
		}
	}
	
	public T get(int index) {
		return vector.get(index);
	}
	
	public int size() {
		return vector.size();
	}
	
	@Override
	public Vector<T> clone() {
		Vector<T> tempT = new Vector<T>();
		for(int i=0; i<vector.size(); i++) {
			tempT.add(i, vector.get(i));
		}
		return tempT;
	}

	public Vector<T> subVector(int fromIndex, int toIndex) {
		@SuppressWarnings("unchecked")
		Vector<T> subList = new Vector<T>();
		for(int i=fromIndex; i<=toIndex; i++) {
			subList.add(this.get(i));
		}
		return subList;
	}
	
	public void addAll(Vector<T> tmpVector) {
		vector.addAll(tmpVector.vector);
	}
	
	public void addAll(int index, Vector<T> tmpVector) {
		vector.addAll(index, tmpVector.vector);
	}
	
	public void clear() { 
		vector.clear();
	}
	
	public boolean contains(T element){
		return vector.contains(element);
	}
	
	public boolean equals(Vector<T> tmpVector) {
		return vector.equals(tmpVector.vector);
	}
	
	public int indexOf(T element) {
		return vector.indexOf(element);
	}
	
	public boolean isEmpty() {
		return vector.isEmpty();
	}
	
	public void remove(T element){
		vector.remove(element);
	}
	
	public void remove(int index){
		vector.remove(index);
	}
	
	public void removeAll(Vector<T> tmpVector){
		vector.removeAll(tmpVector.vector);
	}
		
}
