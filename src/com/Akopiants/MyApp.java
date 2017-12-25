package com.Akopiants;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Arithmetic ar = new ArithmeticImpl(ArrayHolder.getArray()); int
		 * countOfSequenceByLines = ar.findMaxSiquenceOnLines(0); int
		 * countOfSequence =
		 * ar.findMaxSiquenceOnRowsAndColumn(countOfSequenceByLines);
		 * System.out.println("The max count of sequences is: " +
		 * countOfSequence);
		 */
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ArithmeticImplRow ar1 = context.getBean("arithmeticRow", ArithmeticImplRow.class);
		ArithmeticImplColumn ar2 = context.getBean("arithmeticColumn", ArithmeticImplColumn.class);
		ar1.start();
		ar2.start();
		ar1.join();
		ar2.join();
		System.out.println("The max sequence of '1' is : "+Math.max(ar1.getCountOfSequence(), ar2.getCountOfSequence()));
	}

	

}
