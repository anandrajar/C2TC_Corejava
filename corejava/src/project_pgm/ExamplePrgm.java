package project_pgm;

public class ExamplePrgm {
	ExamplePrgm(){
		System.out.println("Default Constructor");
	}
		ExamplePrgm(int i, int j){
			System.out.println("Constructor with 2 parameters");
		}
		ExamplePrgm(int i, int j, int k){
			System.out.println("Constructors with 3 parameters");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamplePrgm ex = new ExamplePrgm();
		ExamplePrgm eg = new ExamplePrgm(2,4);
		ExamplePrgm example = new ExamplePrgm(3,6,2);

	}

}
