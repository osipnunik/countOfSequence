package com.Akopiants;

public class ArrayHolder {
	/*this singleton is not been used and writed for demonstration,
	program use array from spring.xml*/
	
	private static int [][] array;
	
	private ArrayHolder(){}
	
	public static int[][] getArray() {
		if (array==null){
			synchronized (ArrayHolder.class) {
				if (array==null){
				array=new int[][]{
					{0, 0, 0, 1, 0, 0},
					{0, 0, 1, 1, 0, 0},
					{0, 0, 0, 1, 0, 0}};
				}
			}
		}
		return array;
	}
	
}
