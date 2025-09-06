package capitulo11;

public class ConverterInterger {

    public static void main(String[] minhaLista) {

        int soma = 0;
        for(String elemento: minhaLista){
            System.out.println(elemento);
            soma += Integer.parseInt(elemento);
        }
        System.out.println("soma dos valores: " + soma);

    }
}
