package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Vector;

public class Units<T> {
	protected Vector<T> units;
	public Units(int size) {
		units = new Vector<T>(size);
	}
	public Units(Vector<T> units) {
		this.units = new Vector<T>();
		this.units = units.clone();
	}
	
	public void update(Vector<T> units) {
		this.units = units.clone();
	}
	public void set(int index, T element) {
		units.set(index, element);
	}
	public T get(int index) {
		return units.get(index);
	}
	public Units<T> clone() {
		Units<T> newUnits = new Units<T>(units);
		return newUnits;
	}
}
