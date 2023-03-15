package EstruturaDeDadosJava.ListaEncadeada;

import EstruturaDeDadosJava.Pilha.No;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    // Verifica se a lista está vazia
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    // Devolve o tamanho da lista
    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while (true) {
            if (referenciaAuxiliar != null) {
                tamanhoLista++;
                if (referenciaAuxiliar.getReferenciaNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getReferenciaNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    // Adiciona um novo elemento ao final da lista
    public void add(T conteudo) {
        No<T> novoNo = new No<T>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getReferenciaNo();
        }
        noAuxiliar.setReferenciaNo(novoNo);
    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getReferenciaNo();
        }

        return noAuxiliar;
    }

    private void validaIndice(int index) {
        if (index >= this.size()) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index
                    + " desta lista. Esta lista só vai até o indice " + (size() - 1) + ".");
        }
    }

    public T get(int index) {
        return getNo(index).getDado();
    }

    public T remove(int index) {
        No<T> noRemover = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noRemover.getReferenciaNo();
            return noRemover.getDado();
        }

        No<T> noAnterior = this.getNo(index - 1);
        noAnterior.setReferenciaNo(noRemover.getReferenciaNo());
        return noRemover.getDado();
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------------------\n";
        stringRetorno += "      Lista Encadeada      \n";
        stringRetorno += "---------------------------\n";
        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size() - 1; i++) {
            stringRetorno += "No{Conteudo= " + noAuxiliar.getDado() + "}\n";
            noAuxiliar = noAuxiliar.getReferenciaNo();
        }

        stringRetorno += "No{Conteudo= " + noAuxiliar.getDado() + "}\n";
        stringRetorno += "null\n";
        stringRetorno += "---------------------------\n";

        return stringRetorno;
    }
}
