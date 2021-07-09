
public class TesteToken {
	
	public TesteToken() {
		
	}
	
	private void run () {
		String frase = "O rAto roeu a roupa do rei de Roma";
		for (int i = 0; i < frase.length(); i++) {
			if ( frase.charAt( i ) == 'A' )
			System.out.println("posição = " + i );
		}
	}
	
	public static void main(String [] args ) {
		TesteToken obj = new TesteToken();
		obj.run();
	}
	

}
