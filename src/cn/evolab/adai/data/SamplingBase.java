package cn.evolab.adai.data;

import cn.evolab.adai.core.matrix.Vector;

public abstract class SamplingBase<T> {
	Vector<T> data;
	public SamplingBase(int size) {
		data = new Vector<T>(size);
	}
	
	public Vector<T> random() {
		for(int i=0; i<this.data.size(); i++) {
			this.data.set(i, this.rand());
		}
		return this.data;
	}
	public Vector<T> get() {
		return this.data;
	}
	public abstract T rand();
}
