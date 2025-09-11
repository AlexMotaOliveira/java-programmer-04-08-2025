package capitulo4;

public class Lab2_3 {

	public static void main(String[] args) {

		MesesAno mes = MesesAno.janeiro;
		int ano = 2024;
		
		switch (mes) {
		case janeiro:
		case marco:
		case maio:
		case julho:
		case agosto:
		case outubro:
		case dezembro:
			System.out.println("O mês escolhido tem 31 dias");
			break;
		case abril:
		case junho:
		case setembro:
		case novembro:
			System.out.println("O mês escolhido tem 30 dias");
			break;
		case fevereiro: {
			if (ano % 4 == 0) {
				System.out.println("O mês escolhido tem 29 dias");
				break;
			} else {
				System.out.println("O mês escolhido tem 28 dias");
				break;
			}
		}

		default:
			System.out.println("mês não existe");
		}

	}

}
