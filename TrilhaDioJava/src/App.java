import ConhecendoJava.SintaxeJava.TiposVariaveis.TiposDeVariaveis;

public class App {
    static TiposDeVariaveis variaveis = new TiposDeVariaveis();
    static String tiposPrimitivos = variaveis.tiposPrimitivos();
    static String valoresMaximos = variaveis.valoresMaximos();
    static String valoresMinimos = variaveis.valoresMinimos();

    public static void main(String[] args) throws Exception {
        System.out.println(tiposPrimitivos);
        System.out.println(valoresMaximos);
        System.out.println(valoresMinimos);
    }

}
