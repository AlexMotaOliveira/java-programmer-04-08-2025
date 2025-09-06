package capitulo8;

public class Cap8Lab2 {

    public static void main(String[] args) {

        if (args.length > 0) {
            try {
                int soma = 0;
                System.out.println("A media das idades");
                for (String elemento : args) {
                    System.out.print(elemento + " ");
                    soma += Integer.parseInt(elemento);
                }

                double resultado = soma / args.length;
                System.out.println("� de: " + resultado);


            }catch (NumberFormatException ex){
                System.out.println();
                System.out.println("***** voc� informou um valor invalido ***");
                ex.printStackTrace();
            }catch (NullPointerException ex){
                ex.printStackTrace();
            }catch (RuntimeException ex){
                // para erros genericos em tempo de execu��o
            }catch (Exception ex){
                //erros em execu��o ou erro de compila��o
            }catch (Throwable ex){

            }

        } else {
            System.out.println("insira os valores para o calculo das medias");
        }
    }
}
