package ds_lab2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Lion l1=new Lion();
		Tiger t1=new Tiger();
		Wolf w1=new Wolf();
		Bull b1=new Bull();
		
				
		
		l1.speak();
		l1.sleep();
		l1.eat(b1);
		l1.mate(t1);
		
		System.out.println();
		
		t1.speak();
		t1.sleep();
		t1.eat(b1);
		t1.mate(w1);
		
		System.out.println();
		
		w1.speak();
		w1.sleep();
		w1.eat(t1);
		w1.mate(w1);
		
		System.out.println();
		
		b1.speak();
		b1.sleep();
		b1.eat(l1);
		b1.mate(b1);
	}
	
	
	
	

}
