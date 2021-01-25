package default_package;

public class DSLab_1 {
	public static void main(String[] args){
		
		//Problem 1
		
		int year=2000, year2=1900, year3=2001, year4=2004;
		
		System.out.println(isLeapYear(year));
		System.out.println(isLeapYear(year2));
		System.out.println(isLeapYear(year3));
		System.out.println(isLeapYear(year4)+"\n");
		
		//Problem 2
		
		// fibonacci through iterative method
		int n=0, n2=1, n3, count=11;
		
		System.out.print("fib(0) is "+n+"\nfib(1) is "+n2);
		
		for(int i=2; i<count;i++){
			n3=n2+n;
			System.out.print("\nfib("+i+") is "+n3);
			n=n2;
			n2=n3;
		}
		
		System.out.println();
		
		//Comment on fibonacci
		
		/* (Same answer will be in the C++ source code too)
		 * I think that the recursive method is much more efficient because
		 * if there is ever a need to call it again or use the function again,
		 * you can simply type fibo(n) to call it again as opposed to the iterative method
		 * which you would need to modify it and type it all again. Although it is simple to modify and redo,
		 * it takes time, making it tedious when you already know how to do it.
		 */
		
		
		
		//fibonacci through recursive method
		for(int i=0; i<11;i++) {
			System.out.print("\nfib("+i+") is "+fibo(i));
		}
		
		System.out.println();
		
	}
	
	public static int fibo(int y)
	{
		if (y<=1)
			return y;
		else
			return fibo(y-1)+fibo(y-2);
	}
	
	public static boolean isLeapYear(int x) {
		boolean leap=false;
		if(x % 4==0) {
			if(x%100==0){
				if(x%400==0) {
					leap=true;
				}
				else
					leap=false;
			
			}
			else
				leap=true;
		}
		return leap;
			
		
	}

}
