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
		
		chooseAnimal();
		
		System.out.println("\nEnd of Program");
		
	}
	
	public static void chooseAnimal() {
		int x;
		
		Lion l1=new Lion();
		Tiger t1=new Tiger();
		Wolf w1=new Wolf();
		Bull b1=new Bull();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\nPlease choose an animal (enter its corresponding #):\n(1)Lion\n(2)Tiger\n(3)Wolf\n(4)Bull");
		
		x=scan.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("You have chosen Lion.");
			Lion l2=new Lion();
			
			System.out.println("\nDo you want your animal to speak?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				l2.speak();
			}
			
			System.out.println("\nDo you want your animal to mate?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				l2.mate(l1);
			}
			
			System.out.println("\nDo you want your animal to eat?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				l2.eat(b1);
			}
			break;
			
		case 2:
			System.out.println("You have chosen Tiger.");
			Tiger t2=new Tiger();
			System.out.println("\nDo you want your animal to speak?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				t2.speak();
			}
			
			System.out.println("\nDo you want your animal to mate?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				t2.mate(t1);
			}
			
			System.out.println("\nDo you want your animal to eat?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				t2.eat(b1);
			}
			break;
			
		case 3:
			System.out.println("You have chosen Wolf.");
			Wolf w2=new Wolf();
			System.out.println("\nDo you want your animal to speak?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				w2.speak();
			}
			
			System.out.println("\nDo you want your animal to mate?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				w2.mate(w1);
			}
			
			System.out.println("\nDo you want your animal to eat?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				w2.eat(b1);
			}
			break;
			
		case 4:
			System.out.println("You have chosen Bull.");
			Bull b2=new Bull();
			System.out.println("\nDo you want your animal to speak?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				b2.speak();
			}
			
			System.out.println("\nDo you want your animal to mate?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				b2.mate(w1);
			}
			
			System.out.println("\nDo you want your animal to eat?\n(1)Yes\n(2)No");
			x=scan.nextInt();
			if(x==1) {
				b2.eat(b1);
			}
			break;
			
		default:
			System.out.println("\nError has been made. Please exit code and try again.");
			
			
		}
	}
	
	

}
