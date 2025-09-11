package capitulo11;

public class ClasseWrapper {

    public static void main(String[] args) {

        int valorInteiro = 10;
        String valorString = "10";
        String texto = "variavel texto";

        System.out.println(texto);
        System.out.println(texto.toUpperCase());
        System.out.println(texto);

//        Integer integer = new Integer();
        int converterValorinteiro = Integer.parseInt(valorString);
        System.out.println(valorString);
        System.out.println(converterValorinteiro);
        String converterValorString = String.valueOf(valorInteiro);

        boolean verdadeiro = Boolean.TRUE == true;
        boolean verdadeiroConvert = Boolean.parseBoolean("true");

        if(Boolean.TRUE == verdadeiro){

        }

        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

//        int intNull = null;
        Integer intNull = null;
        String stringNulla = null;

    }
}
