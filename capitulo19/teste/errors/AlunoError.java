package capitulo19.teste.errors;

public class AlunoError extends  RuntimeException{

    public AlunoError(String message) {
        super(message);
    }

    public AlunoError(String message, Throwable cause) {
        super(message, cause);
    }
}
