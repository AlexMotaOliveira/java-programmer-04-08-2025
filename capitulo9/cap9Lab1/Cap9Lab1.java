package capitulo9.cap9Lab1;

public class Cap9Lab1 {

    public static void main(String[] args) {

        Pessoa aluno1 = new Aluno("Jose",
                15, 'M', 123456789,
                "05/05/2011", 8000.00f, "Java");

        RG rgAluno2 = new RG(123456786, "06/06/2010");
        Pessoa aluno2 = new Aluno("Judas", 17, 'M',
                rgAluno2, 8000.00f, "Java");

        Pessoa professor = new Professor("Alex", 39, 'M',
                133456786, "05/09/1986", 1_000_000.00f, "Java");

        aluno1.falar(" esta presente");
        aluno2.falar(" esta aqui");
        professor.falar(" falou boa noite");

        aluno1.mostrarDados();
        aluno2.mostrarDados();
        professor.mostrarDados();
    }
}
