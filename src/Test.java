import cn.evolab.adai.core.matrix.*;

public class Test {

	public void run() throws MatrixException {
		Matrix<Integer> m = new Matrix<Integer>(5, 10);
		Matrix<Integer> m2 = new Matrix<Integer>();
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				m.setElement(i, j, i*j);
			}
		}
		m2 = m.clone();
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				System.out.print(m.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");
		for(int i=0; i<m2.rowSize(); i++) {
			for(int j=0; j<m2.columnSize(); j++) {
				System.out.print(m2.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				m.setElement(i, j, 0);
			}
		}
		for(int i=0; i<m2.rowSize(); i++) {
			for(int j=0; j<m2.columnSize(); j++) {
				System.out.print(m2.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");
		
	}
	public void matrixTest() {
		Matrix<Integer> m = new Matrix<Integer>(5, 10);
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				m.setElement(i, j, i*j);
			}
		}
		for(int i=0; i<m.rowSize(); i++) {
			for(int j=0; j<m.columnSize(); j++) {
				System.out.print(m.getElement(i, j)+"  ");
			}
			System.out.println();
		}
		System.out.println("----------");

		Vector<Integer> v = new Vector<Integer>();
		v = m.getColumn(9);
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"  ");
		}
		System.out.println();
		
		
	}
	public void vectorTest() {
		Vector<Integer> vector = new Vector<Integer>(10);
		for(int i=0; i<10; i++) {
			vector.set(i, i);
		}

		Vector<Integer> v2 = new Vector<Integer>();
		
		v2 = vector.clone();
		for(int i=0; i<v2.size(); i++) {
			System.out.print(v2.get(i)+"  ");
		}
		System.out.println(v2.size());


		for(int i=0; i<10; i++) {
			vector.set(i, i*i);
		}
		
		for(int i=0; i<vector.size(); i++) {
			System.out.print(vector.get(i)+"  ");
		}
		System.out.println(v2.size());
		
		v2.init(v2.size());
		for(int i=0; i<v2.size(); i++) {
			System.out.print(v2.get(i)+"  ");
		}
		System.out.println(v2.size());
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		try {
			t.run();
		} catch (MatrixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
