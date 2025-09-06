package capitulo19.teste.errors;

public class AlunoNotFound extends AlunoError {

    public AlunoNotFound(String message) {
        super(message);
    }

    public AlunoNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
