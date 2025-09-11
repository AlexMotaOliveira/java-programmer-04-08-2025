package capitulo19.cap19lab1.br.com.impacta.java.errors;

public class FuncionarioNotFound extends FuncionarioError {

    public FuncionarioNotFound(String message) {
        super(message);
    }

    public FuncionarioNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
