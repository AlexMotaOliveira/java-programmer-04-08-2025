package capitulo19.cap19lab1.br.com.impacta.java.errors;

public class FuncionarioError extends  RuntimeException{

    public FuncionarioError(String message) {
        super(message);
    }

    public FuncionarioError(String message, Throwable cause) {
        super(message, cause);
    }
}
