package primeiro_projeto;

public class EstruturaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//dando valor ao vetor
		String[] vect = new String[] {
				
				"Maria",
				"Bob",
				"Alex"
			};
		
		//percorrendo o vetor com for
		
		for(int i=0; i<vect.length; i++) {
			
			System.out.println(vect[i]);
			
		}
		
		System.out.println("-----------------------------------");
		
		//percorrendo o vetor com forEach
		
		for(String campo : vect) {
			
			System.out.println(campo);
		}

	}

}
