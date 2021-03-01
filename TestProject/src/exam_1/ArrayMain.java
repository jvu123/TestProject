package exam_1;

public class ArrayMain {
	public static void main(String[] args) {
		Array<Integer> int_Array=new Array<Integer>(5); //integer array
		
		Array<Character>char_Array=new Array<Character>(5); //character array
		
		//inserting integers in integer array
		int_Array.insertAt(0,1);
		int_Array.insertAt(1,3);
		int_Array.insertAt(2,3);
		int_Array.insertAt(3,7);
		int_Array.insertAt(4,1);
		
		//inserting characters in character array
		char_Array.insertAt(0,'a');
		char_Array.insertAt(1,'c');
		char_Array.insertAt(2,'e');
		char_Array.insertAt(3,'c');
		char_Array.insertAt(4,'a');
		
		int size=int_Array.sizeOf(); //size of integer array
		int size2=char_Array.sizeOf(); //size of character array
		
		System.out.println(size);
		System.out.println(size2);
		
		//int_Array.removeAt(4);
		//char_Array.removeAt(3);
		
		//Array.sort(int_Array);
		//Array.sort(char_Array);
		
		//System.out.println(Array.search(int_Array,1));
		//System.out.println(Array.search(int_Array,2));
		
		//System.out.println(Array.search(char_Array,'e'));
		//System.out.println(Array.search(char_Array,'b'));
		
		//int_Array.removeDup();
		//char_Array.removeDup();
		
		//int_Array.shuffle();
		//char_Array.shuffle();
		
		//int_Array.filter();
		//char_Array.filter();
		
		Array<Integer> int_Array2=new Array<Integer>(int_Array.slice(1, 3)); //slice method on integer array
		int_Array2.print();
		Array<Character> char_Array2=new Array<Character>(char_Array.slice(1, 3)); //slice method on character array
		char_Array2.print();
		
		//System.out.println(int_Array.isEmpty());
		//System.out.println(char_Array.isEmpty());
		
		//System.out.println(int_Array.isEqual(int_Array));
		//System.out.println(char_Array.isEqual(char_Array));
		
		//System.out.println(int_Array.isEqual(char_Array));
		//System.out.println(char_Array.isEqual(int_Array));
		
		int_Array.print();
		char_Array.print();
	}

}
