package capitulo4;

public class EstruturaControle2 {

	public static void main(String[] args) {

		int ano = 1998;

		if (ano >= 1946 && ano <= 1964) {
			System.out.println("Baby Boomers");
		}
		if (ano >= 1965 && ano <= 1980) {
			System.out.println("Geração X");
		}
		if (ano >= 1981 && ano <= 2000) {
			System.out.println("Gereção Y(Millennials)");
		}
		if (ano >= 1997 && ano <= 2012) {
			System.out.println("Geração Z");
		}
		if (ano >= 2013) {
			System.out.println("Geraçao Alpha");
		} else {
			System.out.println("Não tem geração definida");
		}
		
		
		if (ano >= 1946 && ano <= 1964) {
			System.out.println("Baby Boomers");
		} else if (ano <= 1980) {
			System.out.println("Geração X");
		} else if (ano <= 2000) {
			System.out.println("Gereção Y(Millennials)");
		} else if (ano <=2012) {
			System.out.println("Geração Z");
		} else if (ano >= 2013) {
			System.out.println("Geraçao Alpha");
		} else {
			System.out.println("Não tem geração definida");
		}

	}

}
