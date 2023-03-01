package ConhecendoJava.SintaxeJava.TiposVariaveis;

public class TiposDeVariaveis {
    public String tiposPrimitivos() {
        /*
         * Os oito tipos primitivos em Java são:
         * int, byte, short, long, float, double, boolean e char
         * esses tipos não são considerados objetos e portanto representam valores
         * brutos.
         * Eles são armazenados diretamente na pilha de memória. (Memory stack)
         */
        return ("Os tipos primitivos sao: int, byte, short, long, float, double, boolean e char");
    }

    public String valoresMaximos() {
        String maximos = "Os valores maximos para os tipos primitivos sao:\n";
        maximos = maximos.concat("byte: 127\n");
        maximos = maximos.concat("short: 32.767\n");
        maximos = maximos.concat("int: 2.147.483.647\n");
        maximos = maximos.concat("long: 9.223.372.036.854.775.807\n");
        maximos = maximos.concat("float: 3,4028E + 38\n");
        maximos = maximos.concat("double: 1,7976E + 308\n");
        return (maximos);
    }

    public String valoresMinimos() {
        String minimos = "Os valores minimos para os tipos primitivos sao:\n";
        minimos = minimos.concat("byte: -128\n");
        minimos = minimos.concat("short: -32.768\n");
        minimos = minimos.concat("int: -2.147.483.648\n");
        minimos = minimos.concat("long: -9.223.372.036.854.775.808\n");
        minimos = minimos.concat("float: -3,4028E + 38\n");
        minimos = minimos.concat("double: -1,7976E + 308\n");
        return (minimos);
    }
}
