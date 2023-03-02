import ConhecendoJava.SintaxeJava.TiposVariaveis.TiposDeVariaveis;
import ConhecendoJava.SintaxeJava.Operadores.Operadores;

public class App {
    static TiposDeVariaveis variaveis = new TiposDeVariaveis();
    static Operadores operadores = new Operadores();

    static String tiposPrimitivos = variaveis.tiposPrimitivos();
    static String valoresMaximos = variaveis.valoresMaximos();
    static String valoresMinimos = variaveis.valoresMinimos();
    static String operadorDeAtribuicao = operadores.operadorDeAtribuicao();
    static String operadoresAritimeticos = operadores.operadoresAritimeticos();
    static String operadoresunarios = operadores.operadoresUnarios();

    public static void main(String[] args) throws Exception {
        System.out.println(tiposPrimitivos);
        System.out.println(valoresMaximos);
        System.out.println(valoresMinimos);
        System.out.println(operadorDeAtribuicao);
        System.out.println(operadoresAritimeticos);
        System.out.println(operadoresunarios);
    }

}
