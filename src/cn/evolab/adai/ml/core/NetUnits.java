package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Vector;

public class NetUnits<T> extends Units<T> {

	public NetUnits(int size) {
		super(size);
	}
	public NetUnits(Vector<T> units) {
		super(units);
	}

}
