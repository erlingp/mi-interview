package mi.threen4methods;

public class Java3Numbers {

	public static void main(String[] args) {
		
		
		double dblNum1 = Math.random()*10;
		double dblNum2 = Math.random()*10;
		double dblNum3 = Math.random()*10;
		
		
		int x = (int)dblNum1;
		int y = (int)dblNum2;
		int z = (int)dblNum3;
		
		FourOp3Nums method = new FourOp3Nums();
		
		
		System.out.println("Three numbers selected this time are: ");
		method.disp(x);
		method.disp(y);
		method.disp(z);
		
		String result =method.plus(x, y, z)
				+method.minus(x, y, z)
				+method.multiply(x, y, z)
				+method.divide(x, y, z);
		
		int l = result.length();
		
		System.out.println("The result is: ");
		if (l ==0) {
		
			System.out.println("None");
		
		} else {
			
			
			
			
			System.out.println(result);
		}

	}

}
