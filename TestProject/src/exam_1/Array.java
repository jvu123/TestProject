package exam_1;

import java.lang.Math;

public class Array <T>{
	private final Object[] obj_data; //object array, runtime is 1 --- O(1)
	public final int size;//runtime is 1 --- O(1)
	
	//class constructor
	//runtime is n+2 --- O(n)
	Array(int size){
		//instantiate a new Object array of specified size
		obj_data=new Object [size];
		this.size = size;
		
	}
	
	//gets the element of given index
	//runtime is 2 --- O(1)
	@SuppressWarnings("unchecked")
	T get(int i) {
		final T t=(T)obj_data[i];
		return t;
	}
	
	//inserts element at given index
	//runtime is 1 --- O(1)
	void insertAt(int i, T t){
		obj_data[i]=t;
	}
	
	//prints the array
	//runtime is n+1 --- O(n)
	void print() {
		  for(Object element : obj_data) {
			  System.out.printf("%s ", element);
		  }
		  System.out.println();
	  }
	
	//returns the size of array
	//runtime is 1 --- O(1)
	int sizeOf() {
		return this.size;
	}
	
	//returns true or false if the array is empty or not
	//runtime is 2n --- O(n)
	boolean isEmpty(){
		 if(this.size==0) {
			 return true;
		 }
		  
	   for( int index =  0 ; index < this.size; index ++ ) {
		   if(obj_data[index] != null) {
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
	    		if ( (((Array<?>) other).get(i))!=(obj_data[i]) ){
		            return false;
		        }
	    	}
	    }
	    return true;
	}
	
	//removes the element at the given index and replaces it with null
	//runtime is 3 --- O(1)
	void removeAt(int i) {
		if( i < 0 || i>=this.size ){
		     System.out.println("Index is outside of the range of the array");
		      return;
		    }
		    
		    this.obj_data[i] = null;
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
	
	//Removes duplicate elements
	//runtime is 3n^2 + n + 1 --- O(n^2)
	void removeDup() {
		  int counter=1;
		  for(int i=0; i<this.size;i++) {
			  if(this.obj_data[i]!=null) {
				  for(int j=counter; j<this.size;j++) {
					  if(this.obj_data[i]==this.obj_data[j]) {
						  this.obj_data[j]=null;
					  }
					  
				  }
			  }	else {
				  i+=1;
				  counter+=1;
				  
			  }
			  counter+=1;
		  }
	  }
	
	//slices the object where the given index is and places those elements in a sub array
	//runtime is 3n+3 --- O(n)
	Object[] slice(int i) {
		int counter=i;
		int size=(this.size)-i;
		Object[] data=new Object[size];
		for(int j=0; j<size;j++) {
			data[j]=this.obj_data[counter];
			counter++;
		}
		return data;
		
	}
	
	//shuffles the array using random integers
	//runtime is 3n+3 --- O(n)
	void shuffle() {
		
		int max=this.size;
		int min=0;//1
		int range=max-min-1;
		
		for(int i=0; i<this.size;i++) {
			int randI=(int)(Math.random()*range)+1;
			Object temp = obj_data[randI];
			obj_data[randI]=obj_data[i];
			obj_data[i]=temp;
		}
		
	}
	
	//filters the array to display elements at even indices
	//runtime is 2n+1 --- O(n)
	void filter() {
		for(int i=0; i<this.size;i++) {
			if(i%2==0) {
				System.out.printf("%s ", obj_data[i]);
			}
				
		}
		System.out.println();
	}

}
