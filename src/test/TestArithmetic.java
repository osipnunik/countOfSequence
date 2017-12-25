package test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Akopiants.*;

public class TestArithmetic {
	
	private static ArithmeticImplColumn arC;
	private static ArithmeticImplRow arR;

	@BeforeClass
	public static void init() {
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
		arC =  context.getBean("arithmeticColumn", ArithmeticImplColumn.class);
		arR = context.getBean("arithmeticRow", ArithmeticImplRow.class);
	}

	@Test
	public void testCuontityOnLine() {
		init();
		Assert.assertEquals(arR.findMaxSiquenceOnLines(), 2);
	}

	@Test
	public void testCuontityOnRow() {
		init();
		Assert.assertTrue(arC.findMaxSiquenceOnRows() == 3);
	}
		

}
