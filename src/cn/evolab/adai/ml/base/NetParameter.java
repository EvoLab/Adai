package cn.evolab.adai.ml.base;

import java.util.ArrayList;

import cn.evolab.adai.core.matrix.Matrix;
import cn.evolab.adai.ml.core.Bias;

public abstract class NetParameter<NT> {
	
	protected ArrayList<Matrix<NT>> weightList;
	protected ArrayList<Bias<NT>> biasList;
	
	/*
	public NetParameter() {
		this.weightList = new ArrayList<Matrix<NT>>();
		this.biasList = new ArrayList<Bias<NT>>();
	}
	*/

	public NetParameter(Matrix<NT> weight, Bias<NT> bias) {
		this.weightList = new ArrayList<Matrix<NT>>();
		this.biasList = new ArrayList<Bias<NT>>();
		this.weightList.add(weight);
		this.biasList.add(bias);
		this.init();
	}
	public NetParameter(ArrayList<Matrix<NT>> weightList, ArrayList<Bias<NT>> biasList) {
		this.weightList = weightList;
		this.biasList = biasList;
		this.init();
	}
	
	// weight getter and setter
	public Matrix<NT> getWeight(int index) {
		return weightList.get(index);
	}
	public void setWeight(int index, Matrix<NT> weight) {
		this.weightList.set(index, weight);
	}
	public Matrix<NT> getWeight() {
		return this.weightList.get(0);
	}
	public void setWeight(Matrix<NT> weight) {
		this.weightList.set(0, weight);
	}
	public ArrayList<Matrix<NT>> getWeightList() {
		return weightList;
	}
	public void setWeightList(ArrayList<Matrix<NT>> weightList) {
		this.weightList = weightList;
	}
	
	// bias getter and setter
	public Bias<NT> getBias(int index) {
		return biasList.get(index);
	}
	public void setBias(int index, Bias<NT> bias) {
		this.biasList.set(index, bias);
	}
	public Bias<NT> getBias() {
		return this.getBias(0);
	}
	public void setBias(Bias<NT> bias) {
		this.biasList.set(0, bias);
	}
	public ArrayList<Bias<NT>> getBiasList() {
		return biasList;
	}
	public void setBiasList(ArrayList<Bias<NT>> biasList) {
		this.biasList = biasList;
	}
	
	// add weight
	public void addWeight(Matrix<NT> weight) {
		this.weightList.add(weight);
	}
	public void addBias(Bias<NT> bias) {
		this.biasList.add(bias);
	}
	
	// get size
	public int getWeightListSize() {
		return this.weightList.size();
	}
	public int getBiasListSize() {
		return this.biasList.size();
	}
	
	public void updateWeightList(ArrayList<Matrix<NT>> weightList) {
		this.weightList = weightList;
	}
	public void updateBiasList(ArrayList<Bias<NT>> biasList) {
		this.biasList = biasList;
	}
	public void update(ArrayList<Matrix<NT>> weightList, ArrayList<Bias<NT>> biasList) {
		this.weightList = weightList;
		this.biasList = biasList;
	}
	public void update(NetParameter<NT> netParameter) {
		this.update(netParameter.getWeightList(), netParameter.getBiasList());
	}
	
	protected void init() {
		for(int i=0; i<this.weightList.size(); i++) {
			this.weightList.set(i, weightInit(this.weightList.get(i).rowSize(), this.weightList.get(i).columnSize()));
		}
		for(int i=0; i<this.biasList.size(); i++) {
			this.biasList.set(i, biasInit(this.biasList.get(i).getVector().size()));
		}
	}
	public abstract Matrix<NT> weightInit(int visibleSize, int hiddenSize);
	public abstract Bias<NT> biasInit(int biasVectorSize);
	
	
}
