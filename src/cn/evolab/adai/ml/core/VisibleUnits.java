package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Vector;

public class VisibleUnits<T> extends Units<T> {

	public VisibleUnits(int size) {
		super(size);
	}
	public VisibleUnits(Vector<T> units) {
		super(units);
	}

}
