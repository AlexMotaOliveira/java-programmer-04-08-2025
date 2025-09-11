package capitulo5.cap5lab2;

public class Garagem {

    Carro carroPasseio;
    Carro carroUtilitario;

    public static void main(String[] args) {

        Garagem g = new Garagem();
        //instanciando o atributo carro passeio
        g.carroPasseio = new Carro();
        g.carroPasseio.cor = "vermelho";
        g.carroPasseio.modelo = "fusca";
        g.carroPasseio.potencia = "5cv";
        g.carroPasseio.imprimir();

        //instanciando o objeto carro e depos atribuindo a garagem
        Carro utilitario = new Carro();
        utilitario.cor = "azul";
        utilitario.modelo = "kombi";
        utilitario.potencia = "12cv";
        g.carroUtilitario = utilitario;
        g.carroUtilitario.imprimir();

    }
}
