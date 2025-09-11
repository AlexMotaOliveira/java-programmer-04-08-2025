package capitulo9;

//super classe
public class Professor extends Funcionario {

    private String materia;

    public Professor(String materia) {
        this.materia = materia;
    }

    public Professor(String funcional, String nome, String email, String materia) {
//        super.setFuncional(funcional);
//        super.setNome(nome);
//        super.setEmail(email);
//        this.materia = materia;

        super(funcional, nome, email);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override // sobrescrita ou polimorfismo
    public void imprimir() {
        System.out.println("materia: " + this.materia);
        super.imprimir();
        System.out.println();

        super.mostrar();
    }

//    @Override na classe superior foi marcado como final
//    não pode sobreescrever
//    public double salario() {
//        double salario = 10_000_000.00;
//        System.out.println(salario);
//        return salario;
//    }


}
