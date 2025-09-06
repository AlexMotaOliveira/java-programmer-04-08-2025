package capitulo15;

public class MinhaClasseGenerica<T> {

    private T valor;

    public MinhaClasseGenerica(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
