package exam_1;

public class Prob4 {
	//runtime is 9n+2 --- O(n)
	public static void main(String[] args) {
		int[] B= {36,6,29,66,46,763,6,4};
		int[] tempA=new int[B.length];
		int k=30;
		
		arrange(B,tempA,k,0,0,0);
		
		//
		for(int j=0;j<B.length;j++) {
			B[j]=tempA[j];
		}
		
		print(B);
		
		
	}
	
	//runtime is 5n+2 --- O(n)
	public static int[] arrange(int[] a,int[] b, int k,int i, int count,int count2){
		while(i<a.length) {
			if (a[i]<=k) {
				b[count2]=a[i];
				i++;
				count2++;
				return arrange(a,b,k,i,count,count2);
			}
			else {
				b[(b.length-1)-(count)]=a[i];
				i++;
				count++;
				return arrange(a,b,k,i,count,count2);
			}
			
		}
			return null;
	}
	
	//runtime is n+1 --- O(n)
	static void print(int[] b) {
		  for(int i=0; i<b.length;i++) {
			  System.out.printf("%s ", b[i]);
		  }
		  System.out.println();
	  }

}
