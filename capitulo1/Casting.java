package capitulo1;

public class Casting {
	
	public static void main(String[] args) {
		
		// cast implicito
		byte tipoByte = 10;
		short tipoShort = tipoByte;
		int tipoInteiro = tipoShort;
		long tipoLong = tipoInteiro;
		float tipoFloat = tipoLong;
		double tipoDouble = tipoFloat;
		
		//cast explicito
		char tipoChar = (char)tipoByte;
		
		//perda de dado, cast implicito
		long tipoCastLong = 1_111_111_111;
		char castLong = (char) tipoCastLong;
		
		System.out.println("tipo tipoCastLong: " + tipoCastLong);
		System.out.println("tipo castLong: " + castLong);

		
	}

}
