package project_pgm;
//Example program for hierarichal inheritance
class Birds{
	void fly() {
		System.out.println("I am a Bird");
	}
}

class Parrots extends Birds{
	void whatcolorAmI() {
		System.out.println("I am green");
	}
}

public class Crow extends Birds {
	void whatcolorAmI() {
		System.out.println("I am Black");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrots par = new Parrots();
		Crow cro = new Crow();

		par.whatcolorAmI();
		par.fly();

		cro.whatcolorAmI();
		cro.fly();


	}

}
