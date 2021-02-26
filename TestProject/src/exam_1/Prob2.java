package exam_1;
import java.lang.Math;

public class Prob2 {
	//runtime is 4(2n+8)+6 --- O(n)
	public static void main(String[] args) {
		int[] A= {1,3,5,7,9,11}; //1,3,5,7,9
		int[] B= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
		
		//returns true because 2 is not in A
		System.out.println(notInA(2,A));
		//returns false because 3 is in A
		System.out.println(notInA(3,A)+"\n");
		//returns true because 17 is not within the range of the k-bit integer which is between 0 and 15.
		//log(15) + 1 = 4 bits
		System.out.println(notInA(17,B)); 
		//returns false because 3 is in B
		System.out.println(notInA(3,B)+"\n");
	}
	
	//runtime 2n+8 --- O(n)
	//returns true if given x is not in the array
	//returns false if given x is in the array
	static boolean notInA(int x, int[] arr) {
		
		int y;
		
		double value=Math.log(arr.length)/Math.log(2);
		
		int k=(int)value+1;
		
		if(k==1) {
			y=1;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
		}
		else if(k==2){
			y=3;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
			
		}
		else if(k==3) {
			y=7;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
			
		}
		else if(k==4) {
			y=15;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
			
		}
		else if(k==5) {
			y=31;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
			
		}
		else if(k==6) {
			y=63;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
			
		}
		else if(k==7) {
			y=127;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
			
		}
		else if(k==8) {
			y=255;
			if(x>y) {
				return true;
			}
			else if(x<0){
				return true;
				
			}
			
		}
		
		else {
			return true;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				return false;
			}
		}
		return true;
	
	}
}
