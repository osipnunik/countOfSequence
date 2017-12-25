package com.Akopiants;

public class ArithmeticImplColumn extends Thread{
	private int countOfSequence;
	@Override
	public void run() {
		countOfSequence = findMaxSiquenceOnRows();
	}

	private int array[][];
		
	public ArithmeticImplColumn() {
		super();
	}

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	public ArithmeticImplColumn(int[][] array) {
		this.array = array;
	}
	
	public int getCountOfSequence() {
		return countOfSequence;
	}

	public int findMaxSiquenceOnRows() {
		int count = 0;
		int maxCount = 0;
		for (int j = 0; j < array[0].length; j++) {
			//System.out.println("ColumnClass");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i][j]+"C ");
				if (array[i][j] == 1) {
					count++;
				}
			}
			System.out.println();
			if (count > maxCount) {
				maxCount = count;
			}
			count = 0;
		}
		return maxCount;
	}
}
