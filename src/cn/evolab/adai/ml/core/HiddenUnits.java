package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Vector;

public class HiddenUnits<T> extends Units<T> {

	public HiddenUnits(int size) {
		super(size);
	}
	public HiddenUnits(Vector<T> units) {
		super(units);
	}

}
