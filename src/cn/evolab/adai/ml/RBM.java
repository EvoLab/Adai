package cn.evolab.adai.ml;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.ml.core.HiddenUnits;
import cn.evolab.adai.ml.core.NetUnits;
import cn.evolab.adai.ml.core.VisibleUnits;
import cn.evolab.adai.ml.core.Weight;

public class RBM<VT, WT, HT> {
	
	protected VisibleUnits<VT> visibleUnits, newVisibleUnits;
	protected HiddenUnits<HT> hiddenUnits;
	protected NetUnits<WT> netUnits;
	
	protected VT aBias;
	protected HT bBias;
	protected double error;

	// Parameters
	protected Weight<WT> weight;
	protected Vector<WT> aBiasVector;
	protected Vector<WT> bBiasVector;

	public RBM(int visibleSize, int hiddenSize, VT aBias, HT bBias) {
		visibleUnits = new VisibleUnits<VT>(visibleSize);
		newVisibleUnits = new VisibleUnits<VT>(visibleSize);
		hiddenUnits = new HiddenUnits<HT>(hiddenSize);
		netUnits = new NetUnits<WT>(hiddenSize);
		
		weight = new Weight<WT>(visibleSize, hiddenSize);
		aBiasVector = new Vector<WT>(visibleSize);
		bBiasVector = new Vector<WT>(hiddenSize);
		
		this.aBias = aBias;
		this.bBias = bBias;
		error = 0;
	}
	
	// update parameter
	public void update (Weight<WT> weight, Vector<WT> aBiasVector, Vector<WT> bBiasVector) {
		this.setWeight(weight);
		this.setaBiasVector(aBiasVector);
		this.setbBiasVector(bBiasVector);
	}
	
	// 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// step 1: get input visible units
	public void importVisibleUnits(VisibleUnits<VT> visibleUnits) {
		this.setVisibleUnits(visibleUnits);
	}
	
	// step 2: get net units: netUnits = run(visibleUnits, weight)
	public NetUnits<WT> runNetUnits(VisibleUnits<VT> visibleUnits, Weight<WT> weight) {
		
		return netUnits;
	}
	
	
	// step 3: get hidden units by Activation Function hiddenUnits = activation.run(netUnits, aBiasVector)
	// step 4: get net units: netUnits = run(hiddenUnits, bBiasVector)
	// step 5: get new visible units: visibleUnits = activation.run(netUnits, bBiasVector)
	
	// step 6: get Error 
	public double run() {
		
		return this.error;
	}
	
	// Settings
	public VisibleUnits<VT> getVisibleUnits() {
		return visibleUnits;
	}

	public void setVisibleUnits(VisibleUnits<VT> visibleUnits) {
		this.visibleUnits = visibleUnits;
	}

	public HiddenUnits<HT> getHiddenUnits() {
		return hiddenUnits;
	}

	public void setHiddenUnits(HiddenUnits<HT> hiddenUnits) {
		this.hiddenUnits = hiddenUnits;
	}

	public VT getaBias() {
		return aBias;
	}

	public void setaBias(VT aBias) {
		this.aBias = aBias;
	}

	public HT getbBias() {
		return bBias;
	}

	public void setbBias(HT bBias) {
		this.bBias = bBias;
	}

	public Weight<WT> getWeight() {
		return weight;
	}

	public void setWeight(Weight<WT> weight) {
		this.weight = weight;
	}

	public Vector<WT> getaBiasVector() {
		return aBiasVector;
	}

	public void setaBiasVector(Vector<WT> aBiasVector) {
		this.aBiasVector = aBiasVector;
	}

	public Vector<WT> getbBiasVector() {
		return bBiasVector;
	}

	public void setbBiasVector(Vector<WT> bBiasVector) {
		this.bBiasVector = bBiasVector;
	}

	public NetUnits<WT> getNetUnits() {
		return netUnits;
	}

	public void setNetUnits(NetUnits<WT> netUnits) {
		this.netUnits = netUnits;
	}
	
}
