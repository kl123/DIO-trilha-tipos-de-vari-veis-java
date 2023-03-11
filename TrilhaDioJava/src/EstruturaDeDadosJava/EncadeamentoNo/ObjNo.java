package EstruturaDeDadosJava.EncadeamentoNo;

//O comando <T> após o nome da classe determina que ela será do tipo genérico, ou seja, que aceitará qualquer tipo
public class ObjNo<T> {

    // Variável qeu armazana o dado de um nó
    private T conteudo;

    // Variável qeu armazena a referência de memória do próximo nó
    private ObjNo<T> proximo;

    // Método para criação de um novo nó
    public ObjNo(T conteudo) {
        this.proximo = null;
        this.conteudo = conteudo;
    }

    // Método que retorna o valor de um nó
    public T getConteudo() {
        return conteudo;
    }

    // Método que adiciona um valor a um nó
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    // Método que retorna a referência para o próximo nó
    public ObjNo<T> getProximo() {
        return proximo;
    }

    // Método que adiciona a referência a um próximo nó
    public void setProximo(ObjNo<T> proximo) {
        this.proximo = proximo;
    }

}
