import ConhecendoJava.SintaxeJava.TiposVariaveis.TiposDeVariaveis;
import ConhecendoJava.SintaxeJava.Operadores.Operadores;
import ConhecendoJava.SintaxeJava.Metodos.Metodos;
import ConhecendoJava.SintaxeJava.Escopo.Escopo;
import ConhecendoJava.SintaxeJava.PalavrasReservadas.PalavrasReservadas;
import java.util.Scanner;

public class App {
    static TiposDeVariaveis variaveis = new TiposDeVariaveis();
    static Operadores operadores = new Operadores();
    static Metodos metodos = new Metodos();
    static Escopo escopo = new Escopo();
    static PalavrasReservadas palavrasReservadas = new PalavrasReservadas();

    public static void main(String[] args) throws Exception {
        selecionarAssunto();
    }

    public static void selecionarAssunto() {
        int numeroAssunto;
        String texto = "Digite o número conrrespondente ao assunto que queria saber:\n";
        texto = texto.concat("1. Tipos de variáveis em java\n");
        texto = texto.concat("2. Operadores em java\n");
        texto = texto.concat("3. Métodos em java\n");
        texto = texto.concat("4. Escopo em java\n");
        texto = texto.concat("5. Palavras reservadas em java\n");
        texto = texto.concat("Digite qualquer outro número para sair\n");
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        numeroAssunto = scanner.nextInt();

        while ((numeroAssunto < 6) && (numeroAssunto > 0)) {
            switch (numeroAssunto) {
                case 1:
                    variaveis.imprimirTiposPrimitivos();
                    variaveis.imprimirValoresMaximos();
                    variaveis.imprimirValoresMinimos();
                    break;

                case 2:
                    operadores.imprimirOperadorDeAtribuicao();
                    operadores.imprimirOperadoresAritimeticos();
                    operadores.imprimirOperadoresUnarios();
                    operadores.imprimirOperadoresRelacionais();
                    operadores.imprimirOperadoresLogicos();
                    break;

                case 3:
                    metodos.imprimirAnotacoesMetodos();
                    break;

                case 4:
                    escopo.imprimirEscopo();
                    break;

                case 5:
                    palavrasReservadas.imprimirPalavrasReservadas();
                    break;
            }

            System.out.println(texto);
            numeroAssunto = scanner.nextInt();
        }

    }

}
