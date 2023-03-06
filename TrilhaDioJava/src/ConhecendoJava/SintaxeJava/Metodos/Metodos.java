package ConhecendoJava.SintaxeJava.Metodos;

public class Metodos {
    public void imprimirAnotacoesMetodos() {
        String imprimirAnotacoesMetodos = "Os métodoscorrespondem a funções ou sub-rotinas disponíveis dentro de nossas classes.\n";
        imprimirAnotacoesMetodos = imprimirAnotacoesMetodos.concat("Critério de nomeação de Métodos:\n");
        imprimirAnotacoesMetodos = imprimirAnotacoesMetodos.concat("Deve ser nomeado como verbo;\n");
        imprimirAnotacoesMetodos = imprimirAnotacoesMetodos.concat(
                "Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).\n");
        imprimirAnotacoesMetodos = imprimirAnotacoesMetodos
                .concat("Exemplos sugeridos para nomenclatura de métodos:\n");
        imprimirAnotacoesMetodos = imprimirAnotacoesMetodos.concat("    somar(int n1, int n2){}\n");
        imprimirAnotacoesMetodos = imprimirAnotacoesMetodos.concat("    abrirConexao(){}\n");
        imprimirAnotacoesMetodos = imprimirAnotacoesMetodos.concat("    concluirProcessamento() {}\n");
        System.out.println(imprimirAnotacoesMetodos);
    }
}
