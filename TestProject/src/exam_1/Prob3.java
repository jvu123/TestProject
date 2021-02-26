package exam_1;

public class Prob3 {
	public static void main(String[] args) {
		int[] A= {10,3,6,12,26};
		int[] B= {4,2,5,1,9};
		
		sort(A);
		sort(B);
		
		print(A);
		print(B);
		
		System.out.println();
		
		System.out.println(notSum(3,A));
		System.out.println(notSum(9,A)+"\n");
		System.out.println(notSum(5,B)); 
		System.out.println(notSum(14,B)+"\n");
	}
	
	//runtime 4n+4 --- O(n)
	//only works when the array is sorted
	static boolean notSum(int x, int[] arr) {
		if(arr.length>1) {
			int count=0;
			int count2=arr.length-1;
			for(int j=0; j<arr.length;j++) {
				if(count!=count2) {
					int y=arr[count]+arr[count2];
					if(y<x) {
						count++;
					} else if(y>x) {
						count2--;
					} else if(y==x) {
						//return false if there are sums
						return false;
					}
				}
			}
		}
		
		//returns true if there are no sums
		return true;
	
	}
	
	//sorts the given array using insertion sort
	//runtime is 3n^2 + 3n + 2 --- 0(n^2)
	static void sort(int[] E){
		for(int i=1; i<E.length;i++){
			int temp=E[i];
			int j=i;
			while(j>0 && E[j-1]>temp) {
				E[j]=E[j-1];
				j-=1;
			}
					
			E[j]=temp;
						
		}
				
			  
	}
	
	//runtime is n+1 --- O(n)
	static void print(int[] b) {
		for(int i=0; i<b.length;i++) {
			System.out.printf("%s ", b[i]);
		}
		System.out.println();
	}

}
