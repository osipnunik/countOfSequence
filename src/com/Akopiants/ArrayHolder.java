package com.Akopiants;

public class ArrayHolder {

	private static final int array[][] = {//this singleton is not been used and writed for demonstration, program use array from spring.xml
				{0, 0, 0, 1, 0, 0},
				{0, 0, 1, 1, 0, 0},
				{0, 0, 0, 1, 0, 0}};

	public static int[][] getArray() {
		return array;
	}
	
}
