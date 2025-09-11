package capitulo19.cap19lab1.br.com.impacta.java.dao;

public class DAOException extends Exception {

    public DAOException() {
        super();
    }

    public DAOException(String mensagem) {
        super(mensagem);
    }

    public DAOException(String mensagem, Throwable error) {
        super(mensagem, error);
    }

    public DAOException(Throwable error) {
        super(error);
    }


}
