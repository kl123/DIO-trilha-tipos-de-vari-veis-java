package EstruturaDeDadosJava.Pilha;

public class No<T> {
    private T dado;
    private No<T> referenciaNo;

    public No(T dado) {
        referenciaNo = null;
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No<T> referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dados=" + dado +
                '}';
    }
}
