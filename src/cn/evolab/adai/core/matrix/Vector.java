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
	
	public Vector<T> clone() {
		Vector<T> temp_v = new Vector<T>();
		for(int i=0; i<vector.size(); i++) {
			temp_v.add(i, vector.get(i));
		}
		return temp_v;
	}
	
	// ToDo: other functions of ArrayList
	// public boolean isEmpty() {}
}
