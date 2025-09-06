package capitulo3;

public class OperadorLogico {
	
	public static void main(String[] args) {
		
		int valor = 10;
		
		boolean teste = valor > 15; //falso
		boolean teste2 = valor < 15; //falso
		
		
		                // FALSE    E    true   = false    
		boolean teste3 = valor > 15 && valor < 15; // E 
		
		
                       // true    E    true   = true    
		boolean teste4 = valor == 10 && valor < 15; // E 
		
		                // true    ou    retorna true
		boolean teste5 = valor == 10 || valor < 15; // ou 

        				// false    ou  true   =  true
		boolean teste6 = valor == 11 || valor < 15; // ou 
		
		boolean teste8 = valor == 11 | valor < 15 | valor < 15 ; // ou 
		
		boolean teste9 = valor != 3; // true
		
		boolean teste10 = !teste9; //se for true vai ser false ou o inverso
		
		boolean teste11 = valor + 10 / 2 == 10;
		boolean teste12 = (valor + 10) / 2 == 10;
		
		String ternario = true ? "valor verdadeiro" : "valor se falso";
		String teste13 = 10 == 10 ? "10 é maior que 10" : "10 não é maior que 10";
		int teste14 = 1 > 0 ? 10 : 15;
		
		
		
		
		
	}
}
