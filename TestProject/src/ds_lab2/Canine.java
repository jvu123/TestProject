package ds_lab2;

public class Canine implements Mammal{
	
	@Override
	public void speak() {
		System.out.println("Grrr!");
		
	}

	@Override
	public void eat(Mammal x) {
		if(x instanceof Bovine)
			System.out.println(this + " can eat "+ x);
		else
			System.out.println(this+" cannot eat "+x);
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps between 12-14 hours.");
	}

	@Override
	public void mate(Mammal x) {
		if(x instanceof Canine)
			System.out.println(this + " can mate with "+ x);
		else
			System.out.println(this+" cannot mate with "+ x);
		
	}

}
