package capitulo4;

public class EstruturaControle {

	public static void main(String[] args) {

		// if (10 % 3 == 0) {
		// System.out.println("Validei a condição");
		// System.out.println("e o numero é Par");
		// } else {
		// System.out.println("Validei a condição");
		// System.out.println("impar");
		// }
		//
		// int ano = 1998;
		//
		// if (ano >= 1946 && ano <= 1964) {
		// System.out.println("Baby Boomers");
		// } else if (ano >= 1965 && ano <= 1980) {
		// System.out.println("Geração X");
		// } else if (ano >= 1981 && ano <= 2000) {
		// System.out.println("Gereção Y(Millennials)");
		// } else if (ano >= 1997 && ano <=2012) {
		// System.out.println("Geração Z");
		// } else if (ano >= 2013) {
		// System.out.println("Geraçao Alpha");
		// } else {
		// System.out.println("Não tem geração definida");
		// }
		//
		int outroAno = 1980;

		switch (outroAno) {
		case 1964: {
			System.out.println("Baby Boomers");
			break;
		}
		case 1980: {
			System.out.println("Geração X");
			break;
		}
		case 2000: {
			System.out.println("Gereção Y(Millennials)");
			break;
		}
		case 2012:
			System.out.println("Geração Z");
			break;
		case 2013: {
			System.out.println("Geraçao Alpha");
			break;
		}
		default: {
			System.out.println("Não tem geração definida");
		}
		}

		System.out.println("depois do switch");

		switch (DiasDaSemana.domingo) {
		case segunda: {
			System.out.println(DiasDaSemana.segunda);
			break;
		}
		case terca: {
			System.out.println(DiasDaSemana.terca);
			break;
		}
		case quarta: {
			System.out.println(DiasDaSemana.quarta);
			break;
		}
		case quinta: {
			System.out.println(DiasDaSemana.quarta);
			break;
		}
		case sexta: {
			System.out.println(DiasDaSemana.sexta);
			break;
		}
		default:
			System.out.println("outro dia");
		}

	}

}
