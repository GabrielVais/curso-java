package primeiro_projeto;

public class ConversaoImplicita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		float b;
		int c;
		
		a = 5.0;
		c = (int)a;
		
		b = (float)a;
		
		System.out.println(b);
		System.out.println(c);
	}

}
