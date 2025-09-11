package capitulo13;

import org.junit.jupiter.api.*;

class ClienteTeste {

    private String nome;
    private int idade;
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        System.out.println("vou rodar todas as vezes");
        this.nome = "Alex";
        this.idade = 39;
        this.cliente = new Cliente(nome, idade);
        System.out.println(cliente.toString());
    }

    @Test
    void testeInstanciaCliente() {
        Assertions.assertNotNull(this.cliente);
    }

    @Test
    void testeClienteNulo() {
        Cliente cliente = null;
        Assertions.assertNull(cliente);
    }

    @Test
    void testeMetodosGet() {
        Assertions.assertEquals(nome, cliente.getNome());
        Assertions.assertEquals(idade, cliente.getIdade());
    }

    @Test
    void testeMetodosSet() {
        cliente.setNome(nome);
        cliente.setIdade(idade);

        Assertions.assertEquals(nome, cliente.getNome());
        Assertions.assertEquals(idade, cliente.getIdade());

    }
}
