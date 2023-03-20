package EstruturaDeDadosJava.ListaCircular;

import EstruturaDeDadosJava.Pilha.No;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<T>(conteudo);
        if (isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setReferenciaNo(cauda);
        } else {
            novoNo.setReferenciaNo(this.cauda);
            this.cabeca.setReferenciaNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException();

        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getReferenciaNo();
            this.cabeca.setReferenciaNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setReferenciaNo(this.cauda.getReferenciaNo().getReferenciaNo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }
            noAuxiliar.setReferenciaNo(noAuxiliar.getReferenciaNo().getReferenciaNo());
        }
        this.tamanhoLista--;

    }

    public T get(int index) {
        return this.getNo(index).getDado();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0)
            return cauda;

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getReferenciaNo();
        }

        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------------------\n";
        stringRetorno += "       Lista Circular      \n";
        stringRetorno += "---------------------------\n";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            stringRetorno += "       No{Conteudo= " + noAuxiliar.getDado() + "}\n";
            noAuxiliar = noAuxiliar.getReferenciaNo();
        }
        stringRetorno += isEmpty() ? "       No{null}\n" : "       Retorna ao início\n";

        stringRetorno += "---------------------------\n";
        return stringRetorno;

    }

}
