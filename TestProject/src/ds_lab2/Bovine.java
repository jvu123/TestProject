package ds_lab2;

public class Bovine implements Mammal{

	@Override
	public void speak() {
		System.out.println("Moo!");
		
	}

	@Override
	public void eat(Mammal x) {
		System.out.println(this+" cannot eat "+x);
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps in intervals, estimating about 4 hours per day.");
	}

	@Override
	public void mate(Mammal x) {
		if(x instanceof Bovine)
			System.out.println(this + " can mate with "+ x);
		else
			System.out.println(this+" cannot mate with "+x);
		
	}

}
