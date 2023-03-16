package EstruturaDeDadosJava.ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int size() {
        return tamanhoLista;
    }

    public T get(int index) {
        return this.getNo(index).getDado();
    }

    public NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        NoDuplo<T> noAuxiliar = getNo(index);
        if (index == 0) {
            novoNo.setNoProximo(primeiroNo);
            primeiroNo.setNoPrevio(novoNo);
            primeiroNo = novoNo;
        } else {
            if (index == size()) {
                add(elemento);
                tamanhoLista--;
            } else {
                novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
                novoNo.setNoProximo(noAuxiliar);
                noAuxiliar.setNoPrevio(novoNo);
                novoNo.getNoPrevio().setNoProximo(novoNo);
            }
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }
        } else {
            if (index == tamanhoLista) {
                ultimoNo = ultimoNo.getNoPrevio();
            } else {
                NoDuplo<T> noRemovido = getNo(index);
                NoDuplo<T> noAuxiliar = noRemovido.getNoProximo();
                noAuxiliar.setNoPrevio(noRemovido.getNoPrevio());
                noRemovido.getNoPrevio().setNoProximo(noAuxiliar);
            }
        }

        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------------------\n";
        stringRetorno += " Lista Duplamente Encadeada \n";
        stringRetorno += "----------------------------\n";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size(); i++) {
            stringRetorno += "No{Conteúdo= " + noAuxiliar.getDado() + " }\n";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        stringRetorno += "null\n";
        stringRetorno += "----------------------------\n";

        return stringRetorno;
    }

}
