package ds_lab2;

public class Feline implements Mammal{
	
	@SuppressWarnings("unused")
	private String name;
	
	@Override
	public void speak() {
		System.out.println("Roar!");
		
	}

	@Override
	public void eat(Mammal x) {
		if(x instanceof Feline)
			System.out.println(this + " cannot eat "+ x);
		else if (x instanceof Canine)
			System.out.println(this + " cannot eat "+ x);
		else
			System.out.println(this+" can eat "+x);
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps between 12-16 hours.");
	}

	@Override
	public void mate(Mammal x) {
		if(x instanceof Feline)
			System.out.println(this + " can mate with "+ x);
		else
			System.out.println(this+" cannot mate with "+x);
		
	}
	

}
