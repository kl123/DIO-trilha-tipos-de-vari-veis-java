package EstruturaDeDadosJava.Fila;

import EstruturaDeDadosJava.Pilha.No;

public class Fila<T> {
    private No<T> referenciaNoEntradaFila;

    // Inicializa a fila
    public Fila() {
        this.referenciaNoEntradaFila = null;
    }

    // Adiciona elemento a fila
    public void enqueue(T dado) {
        No<T> novoNo = new No<T>(dado);
        novoNo.setReferenciaNo(referenciaNoEntradaFila);
        referenciaNoEntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = referenciaNoEntradaFila;
            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getDado();
        } else {
            return null;
        }
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = referenciaNoEntradaFila;
            No<T> noAuxiliar = referenciaNoEntradaFila;
            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return primeiroNo.getDado();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return referenciaNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------------------\n";
        stringRetorno += "            Fila           \n";
        stringRetorno += "---------------------------\n";

        No<T> noAuxiliar = referenciaNoEntradaFila;

        if (referenciaNoEntradaFila != null) {
            while (true) {
                stringRetorno += "         No{" + noAuxiliar.getDado() + "}         \n";
                if (noAuxiliar.getReferenciaNo() != null) {
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                } else {
                    stringRetorno += "         Null        \n";
                    break;
                }
            }
        } else {
            stringRetorno += "         Fila vazia        \n";
        }
        stringRetorno += "---------------------------\n";
        return stringRetorno;
    }
}
