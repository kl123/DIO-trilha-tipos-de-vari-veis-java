package EstruturaDeDadosJava.Pilha;

public class Pilha {
    private No referenciaNoEntradaPilha;

    // inicializa uam pilha nula
    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    // retorna o topo da pilha
    public No top() {
        return referenciaNoEntradaPilha;
    }

    // Adiciona um elemento ao topo da pilha
    public void push(No novoNo) {
        No refAuxilir = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        novoNo.setReferenciaNo(refAuxilir);
    }

    // Remove um elemento do topo da pilha e caso esteja vazia retorna nulo
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
            return noPoped;
        } else {
            return null;
        }
    }

    // Retorna se a pilha está vazia ou não
    public boolean isEmpty() {
        if (referenciaNoEntradaPilha == null) {
            return true;
        } else {
            return false;
        }
    }

    // personalziação apra a saída do comando System.out.println
    @Override
    public String toString() {
        String stringRetorno = "---------------------------\n";
        stringRetorno += "          Pilha           \n";
        stringRetorno += "---------------------------\n";

        No noAuxiliar = referenciaNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "No{dado=" + noAuxiliar.getDado() + "}\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            } else {
                break;
            }
        }
        stringRetorno += "---------------------------\n";
        return stringRetorno;
    }
}
