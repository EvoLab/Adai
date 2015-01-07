package cn.evolab.adai.core.matrix;

import java.util.ArrayList;

public class Vector<T> {
	private ArrayList<T> vector;

	public Vector() {
		vector = new ArrayList<T>();
	}
	public Vector(int size) {
		vector = new ArrayList<T>();
		for(int i=0; i<size; i++) {
			vector.add((T)null);
		}
	}
	/* a new constructor, used in function subList() */
	public Vector(ArrayList<T> tmpVector){
		vector = new ArrayList<T>();
		for(int i=0; i<tmpVector.size(); i++) {
			vector.add(tmpVector.get(i));
		}
	}
	public void add(T element) {
		vector.add(element);
	}
	public void add(int index, T element) {
		vector.add(index, element);
	}
	public void addAll(Vector<T> tmpVector){vector.addAll(tmpVector.vector);}
	public void addAll(int index, Vector<T> tmpVector){vector.addAll(index, tmpVector.vector);}
	public void clear(){ vector.clear();}
	public boolean contains(T element){return vector.contains(element);}
	public boolean equals(Vector<T> tmpVector){return vector.equals(tmpVector.vector);}
	public int indexOf(T element){return vector.indexOf(element);}
	public boolean isEmpty(){return vector.isEmpty();}
	public void remove(T element){vector.remove(element);}
	public void remove(int index){vector.remove(index);}
	public void removeAll(Vector<T> tmpVector){vector.removeAll(tmpVector.vector);}
	public Vector<T> subList(int fromIndex, int toIndex){return new Vector<T>((ArrayList<T>)vector.subList(fromIndex, toIndex));}

	public void set(int index, T element) {
		vector.set(index, element);
	}
	public void init(int size) {
		vector.clear();
		for(int i=0; i<size; i++) {
			vector.add(i, (T)null);
		}
	}

	public T get(int index) {
		return vector.get(index);
	}

	public int size() {
		return vector.size();
	}

	public Vector<T> clone() {
		Vector<T> tempT = new Vector<T>();
		for(int i=0; i<vector.size(); i++) {
			tempT.add(i, vector.get(i));
		}
		return tempT;
	}
	public String toString(String  separator){
		String res = "";
		for(int i=0; i<vector.size()-1; i++){
			res = res + vector.get(i) + " ";
		}
		res = res + vector.get(vector.size()-1);
		return res;
	}
	public boolean containsAll(Vector<T> tmpVector){
		for(int i=0; i<tmpVector.size(); i++){
			if(!vector.contains(tmpVector.get(i))){
				return false;
			}
		}
		return true;
	}

	// ToDo: other functions of ArrayList
	// public boolean isEmpty() {}
}
