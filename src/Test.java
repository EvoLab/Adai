import cn.evolab.adai.core.matrix.*;

public class Test {

	public void run() {
		Vector<Integer> vector = new Vector(10);
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
		t.run();
	}

}
