package EstruturaDeDadosJava.EncadeamentoNo;

//O comando <T> após o nome da classe determina que ela será do tipo genérico, ou seja, que aceitará qualquer tipo
public class ObjNo<T> {
    private T conteudo;
    private ObjNo<T> proximo;

    public ObjNo(T conteudo) {
        this.proximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public ObjNo<T> getProximo() {
        return proximo;
    }

    public void setProximo(ObjNo<T> proximo) {
        this.proximo = proximo;
    }

}
