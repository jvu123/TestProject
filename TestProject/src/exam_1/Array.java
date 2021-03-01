package exam_1;

import java.lang.Math;

public class Array <T>{
	private final Object[] obj; //object array, runtime is 1 --- O(1)
	public final int size;//runtime is 1 --- O(1)
	
	//class constructor
	//runtime is n+2 --- O(n)
	Array(int size){
		//instantiate a new Object array of specified size
		obj=new Object [size];
		this.size = size;
		
	}
	
	//class constructor that takes in an Array and clones it into a new array
	//runtime is 2n+3 --- 0(n)
	Array(Array<Character> arr){
		this.obj=new Object[arr.size];
		this.size=arr.size;
		for(int i=0; i<size;i++) {
			this.obj[i]=arr.get(i);
		}
	}
		
		//class constructor that takes in an Object array and clones it into a new array
		//runtime is 2n+2 --- 0(n)
	Array(Object[] arr){
		this.obj=new Object[arr.length];
		this.size=arr.length;
		for(int i=0; i<size;i++) {
			obj[i]=arr[i];
		}
	}
	
	//returns the size of array
	//runtime is 1 --- O(1)
	int sizeOf() {
		return this.size;
	}
	
	//gets the element of given index
	//runtime is 2 --- O(1)
	@SuppressWarnings("unchecked")
	T get(int i) {
		if(i >= this.size || i<0) {
			return null;
		}
		final T t=(T)obj[i];
		return t;
	}
	
	//sorts the given array using insertion sort
	//runtime is 3n^2 + 3n + 2 --- 0(n^2)
	static <T extends Comparable<? super T>> void sort(Array<T> E){
		  for(int i=1; i<E.sizeOf();i++){
			  T temp=E.get(i);
			  int j=i;
				while(j>0 && E.get(j-1).compareTo(temp)>0) {
					E.insertAt(j, E.get(j-1));
					j-=1;
				}
				
				E.insertAt(j, temp);
					
			}
			
		  
	  }
	
	
	//searches for the given element in the array, returns true or false based on whether it is in or not
	//binary search
	//runtime is log 4n + 4 --- O(log n)
	static <T extends Comparable<? super T>> boolean search(Array<T> E,T t) {
		int index=-1;
		int low = 0;
	    int high = E.sizeOf()-1;
	    while (low <= high ){
	    int mid = (low + high) / 2 ;
	      if( E.get(mid).compareTo(t)<0 ){
	       low = mid + 1;
	      } else if(E.get(mid).compareTo(t)>0) {
	       high = mid - 1;
	      } else if(E.get(mid).compareTo(t)==0) {
	    	  index=mid;
	    	  break;
	      }
	    }
	    if(index==-1) {
	    	return false;
	    }
	    return true;
	}
	
	//inserts element at given index
	//runtime is 1 --- O(1)
	void insertAt(int i, T t){
		if(i >= this.size || i<0) {
			System.out.println("Cannot insert at this index");
		}
		
		this.obj[i]=t;
	}
		
	//prints the array
	//runtime is n+1 --- O(n)
	void print() {
		for(Object element : obj) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
		
	//removes the element at the given index and replaces it with null
	//runtime is 3 --- O(1)
	void removeAt(int i) {
		if( i < 0 || i>=this.size ){
			System.out.println("Index is outside of the range of the array");
			return;
		}
			    
		this.obj[i] = null;
	}
	
	//Removes duplicate elements
	//runtime is 3n^2 + n + 1 --- O(n^2)
	void removeDup() {
		  int counter=1;
		  for(int i=0; i<this.size;i++) {
			  if(this.obj[i]!=null) {
				  for(int j=counter; j<this.size;j++) {
					  if(this.obj[i]==this.obj[j]) {
						  this.obj[j]=null;
					  }
					  
				  }
			  }	else {
				  i+=1;
				  counter+=1;
				  
			  }
			  counter+=1;
		  }
	  }
	
	//shuffles the array using random integers
	//runtime is 3n+3 --- O(n)
	void shuffle() {
		
		int max=this.size;
		int range=max-1;
		
		for(int i=0; i<max;i++) {
			int randI=(int)(Math.random()*range)+1;
			Object temp = obj[randI];
			obj[randI]=obj[i];
			obj[i]=temp;
		}
		
	}
	
	//filters the array to display elements at even indices
	//runtime is 2n+1 --- O(n)
	void filter() {
		for(int i=0; i<this.size;i++) {
			if(i%2==0) {
				System.out.printf("%s ", obj[i]);
			}
				
		}
		System.out.println();
	}
	
	//slices the object where the given index is and places those elements in a sub array
	//runtime is 2n+2 --- O(n)
	Object[] slice(int s, int i) {
		if(s<0 || s>=this.size) {
			System.out.println("First number given is out of bounds");
			return null;
		}
		
		if(i<s || i>=this.size) {
			System.out.println("Second number given is out of bounds");
			return null;
		}
		Object[] data=new Object[i-s+1];
		for(int j=0; j<data.length;j++) {
			data[j]=this.obj[s+j];
		}
		return data;
			
	}
	
	//returns true or false if the array is empty or not
	//runtime is 2n --- O(n)
	boolean isEmpty(){
		if(this.size==0) {
			return true;
		}
			  
		for( int index =  0 ; index < this.size; index ++ ) {
			if(obj[index] != null) {
				return false;
			}
		}

		return true;
	}
		
	//returns true or false if the array and other array equal each other
	//runtime is 2n+1 --- O(n)
	public boolean isEqual(Object other){
		if (other instanceof Array<?>){
			if( ((Array<?>) other).sizeOf() != this.size) {
				return false;
			}
		    for( int i =  0 ; i < this.size; i ++ ) {
		    	if ( (((Array<?>) other).get(i))!=(obj[i]) ){
		    		return false;
			    }
		    }
		}
		return true;
	}

}
