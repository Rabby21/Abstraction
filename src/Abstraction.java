
public class Abstraction extends Student1{
	public static void main(String[] args) {
		Abstraction ab=new Abstraction();
		ab.add();
	}


	@Override
	public void add() {
		System.out.println("interface");
		
	}

}
