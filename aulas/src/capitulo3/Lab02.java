package capitulo3;

public class Lab02 {
	
	public static void main(String[] args) {
		
		int valor = 3;
		
		boolean validacao = valor % 2 == 0;
		System.out.println(validacao ? "Par" : "Impar" );
		
		System.out.println(valor % 2 == 0 ? "Par" : "Impar");
	}

}
