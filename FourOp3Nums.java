package mi.threen4methods;

public class FourOp3Nums {
	
	
	double dblNum = Math.random()*10;
	int a = (int)dblNum;
	int b = (int)dblNum;
	int c = (int)dblNum;
	
//	System.Out.println("a"+","+"b"+"","+"c");
	
	


	public static void disp(int a) {
	
	System.out.println(a);
	}
	
	
	public static String plus(int a,int b,int c) {
		
		
		if(a+b == c) {
			return "+";
			
		} else {
			return "";
		}
		
		
	}
	

	public static String minus(int a,int b,int c) {
		
		
		if(a-b == c) {
			return "-";
			
		} else {
			return "";
		}
		
		
	}
	
	public static String multiply(int a,int b,int c) {
		
		
		if(a*b == c) {
			return "*";
			
		} else {
			return "";
		}
		
		
	}
	
	public static String divide(int a,int b,int c) {
		
		if(b ==0) {
			return "";
		} else {
		
			if(a/b == c) {
				return "/";
			
			} else {
			return "";
			}
		}	
	}
}