package capitulo7.Cap7Lab1;

public class Cap7Lab1 {

    public static void main(String[] args) {

        Cadastro cadastroPadrao = new Cadastro();
//        cadastroPadrao.setNome("Alex");
//        cadastroPadrao.setSobreNome("Oliveira");
//        cadastroPadrao.setIdade(39);
        cadastroPadrao.mostrar();

        Cadastro cadastroContrutor2 =
                new Cadastro("Jose", "Silva");
//        cadastroContrutor2.setIdade(25);
        cadastroContrutor2.mostrar();

        Cadastro cadastroContrutor3 =
                new Cadastro("Maria", "Silva", 53);
        cadastroContrutor3.mostrar();
    }
}
