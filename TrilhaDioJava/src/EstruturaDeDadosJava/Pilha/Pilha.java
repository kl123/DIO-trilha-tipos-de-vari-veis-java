package EstruturaDeDadosJava.Pilha;

public class Pilha<T> {

    private No<T> referenciaNoEntradaPilha;

    // inicializa uam pilha nula
    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    // retorna o topo da pilha
    public No<T> top() {
        return referenciaNoEntradaPilha;
    }

    // Adiciona um elemento ao topo da pilha
    public void push(T object) {
        No<T> novoNo = new No<T>(object);
        No<T> refAuxilir = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        novoNo.setReferenciaNo(refAuxilir);
    }

    // Remove um elemento do topo da pilha e caso esteja vazia retorna nulo
    public No<T> pop() {
        if (!this.isEmpty()) {
            No<T> noPoped = referenciaNoEntradaPilha;
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

        No<T> noAuxiliar = referenciaNoEntradaPilha;
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
