package mi.threen4methods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FourOp3NumsTest extends FourOp3Nums {

	@Test
	void test() {
		
		FourOp3Nums mathFunction = new FourOp3Nums();
	//Test Addition
		String expected1 = "+";
		String actual1 = mathFunction.plus(1,2,3);
		
		assertEquals(expected1, actual1);
		
	//Test Subtraction
				String expected2 = "-";
				String actual2 = mathFunction.minus(1, 2, -1);
				
				assertEquals(expected2, actual2);
				
	//Test Multiplication
				String expected3 = "*";
				String actual3 = mathFunction.multiply(3,-3,-9);
				
				assertEquals(expected3, actual3);
						
		
	//Test Division
				String expected4 = "/";
				String actual4 = mathFunction.divide(3,-3,-1);
				
				assertEquals(expected4, actual4);	
		
		
		
		
		
	}
	
	

}
