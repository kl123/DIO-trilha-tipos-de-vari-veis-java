package EstruturaDeDadosJava.ListaDuplamenteEncadeada;

public class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> NoProximo;
    private NoDuplo<T> NoPrevio;

    public NoDuplo(T elemento) {
        this.dado = elemento;
        this.NoPrevio = null;
        this.NoProximo = null;
    }

    public T getDado() {
        return this.dado;
    }

    public void setDado(T elemento) {
        this.dado = elemento;
    }

    public NoDuplo<T> getNoProximo() {
        return NoProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        NoProximo = noProximo;
    }

    public NoDuplo<T> getNoPrevio() {
        return NoPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        NoPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "Conteudo=" + dado +
                '}';
    }
}
