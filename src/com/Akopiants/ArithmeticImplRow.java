package com.Akopiants;

public class ArithmeticImplRow extends Thread  {
	private int countOfSequence;
	@Override
	public void run() {
		countOfSequence = findMaxSiquenceOnLines();
	}

	private int array[][];
		
	public ArithmeticImplRow() {
		super();
	}

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	public int getCountOfSequence() {
		return countOfSequence;
	}

	public int findMaxSiquenceOnLines() {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+"R ");
				if (array[i][j] == 1) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
			System.out.println();
			count = 0;
		}
		return maxCount;
	}

	

}