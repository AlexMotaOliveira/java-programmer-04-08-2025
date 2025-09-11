package capitulo5.cap5lab1;

public class Cap5Lab1 {

    public static void main(String[] args) {

        Funcionario objeto = new Funcionario();
        objeto.nome = "Alex";
        objeto.sobrenome = "Oliveira";
        objeto.cargo = "Instrutor";
        objeto.salario = 100_000;

        System.out.println("nome: " + objeto.nome);
        objeto.imprimir();
    }
}
