import cn.evolab.adai.core.matrix.*;


public class DLTrainingTest {

	public void run() throws VectorException {
		Vector<Double> v = new Vector<Double>(100);
		Matrix<Double> m = new Matrix<Double>(10, 10);
		Matrix<Double> tm = new Matrix<Double>();
		
		tm = v.vectorToMatrix(10, 10);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLTrainingTest t = new DLTrainingTest();
		try {
			t.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
