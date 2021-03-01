package exam_1;

public class StringArray <T>{
	private final Object[] string;// runtime is 1 --- O(1)
	public final int size;// runtime is 1 --- O(1)
	
	//class constructor that takes in a string in its parameters and make it into an array with characters
	//runtime is 2n+3 --- 0(n)
	StringArray(String word){
		this.string=new Object[word.length()];
		this.size=word.length();
		for(int i=0; i<size;i++) {
			string[i]=word.charAt(i);
		}
	}
	
	//class constructor that takes in a StringArray and clones it into a new array
	//runtime is 2n+3 --- 0(n)
	StringArray(StringArray<Character> word){
		this.string=new Object[word.size];
		this.size=word.size;
		for(int i=0; i<size;i++) {
			string[i]=((CharSequence) word).charAt(i);
		}
	}
	
	//class constructor that takes in an Object array and clones it into a new array
	//runtime is 2n+2 --- 0(n)
	StringArray(Object[] word){
		this.string=new Object[word.length];
		this.size=word.length;
		for(int i=0; i<size;i++) {
			string[i]=word[i];
		}
	}
	
	//returns the length of the string array
	//runtime is 1 --- O(1)
	int strlen() {
		return this.size;
	}
	
	//gets the element of given index
	//runtime is 2 --- O(1)
		@SuppressWarnings("unchecked")
		T get(int i) {
			if(i>=this.size || i<0) {
				return null;
			}
			final T t=(T)string[i];
			return t;
		}
	
	//inserts element at given index
	//runtime is 1 == O(1)
	void insertAt(int i, Object string2){
		if(i<this.size || i>=0) {
			string[i]=string2;
		} else {
			System.out.println("Out of bounds");
		}
	}
	
	//prints the array of characters to display words
	//runtime is n+1 --- O(n)
	void print() {
		  for(Object element : string) {
			  System.out.printf("%s", element);
		  }
		  System.out.println();
	  }
	
	//lowercases all the characters in the array
	//runtime is 3n+1 --- O(n)
	void strlwr() {
		for(int i=0; i<string.length;i++) {
			Character temp=(Character) string[i];
			temp=Character.toLowerCase(temp);
			string[i]=temp;
		}
		
	}
	
	//uppercases all the characters in the array
	//runtime is 3n+1 --- O(n)
	void strupr() {
		for(int i=0; i<string.length;i++) {
			Character temp=(Character) string[i];
			temp=Character.toUpperCase(temp);
			string[i]=temp;
		}
	}
	
	//copies a string into another,
	//only works if same size
	//runtime 2n+2 --- O(n)
	void strcpy(StringArray<Character> copy) {
		if(this.size==copy.size) {
			for(int i=0; i<copy.size;i++) {
				if(i<this.size) {
					string[i]=copy.get(i);
				}
			}
			
		} else {
			System.out.println("Out of bounds");
		}
	}
	
	//compares two arrays of characters lexographically.
	//if the character from one comes before the character from the other, a value returns lower than 0
	//if the character from one comes after the character from the other, a value returns higher than 0
	//if the character from one is the same as the character from the other, 0 is returned
	//runtime 6n+4 --- O(n)
	static int strcmp(StringArray<Character> a, StringArray<Character> b){
		int x=0;
		int y=0;
		int z=0;
	    	for( int i =  0 ; i < a.size; i ++ ) {
	    		if(i<b.size) {
	    			x=a.get(i);
		    		y=b.get(i);
		    		z=x-y;
		    		if(z!=0) {
		    			return z; //returns a value greater than or less than 0
		    		} else {
		    			return 1;
		    		}
	    		}
	    	}
	    	return z; //returns 0,
	    	
	}
	
	//makes a new array of both sizes combined and inserts the elements in order,
	//making one string append to the other.
	//runtime is 4n+3 --- O(n)
	static Object[] strcat(StringArray<Character> str, StringArray<Character> str2) {
		Object[] a=new Object[(str.size)+(str2.size)];
		int count=0;
		for(int i=0; i<a.length;i++) {
			if(i<str.size) {
				a[i]=str.get(i);
				count++;
			} else {
				a[i]=str2.get((i)-count);
			}
		}
		return a;//1
			
			
	}
	

}
