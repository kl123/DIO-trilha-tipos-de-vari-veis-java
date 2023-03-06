package ConhecendoJava.SintaxeJava.TiposVariaveis;

import java.util.Scanner;

public class TiposDeVariaveis {
    public void imprimirTiposPrimitivos() {
        System.out.println("\nOs tipos primitivos sao: int, byte, short, long, float, double, boolean e char\n");
    }

    public void imprimirValoresMaximos() {
        String maximos = "\nOs valores maximos para os tipos primitivos sao:\n";
        maximos = maximos.concat("byte: 127\n");
        maximos = maximos.concat("short: 32.767\n");
        maximos = maximos.concat("int: 2.147.483.647\n");
        maximos = maximos.concat("long: 9.223.372.036.854.775.807\n");
        maximos = maximos.concat("float: 3,4028E + 38\n");
        maximos = maximos.concat("double: 1,7976E + 308\n");
        System.out.println(maximos);
    }

    public void imprimirValoresMinimos() {
        String minimos = "\nOs valores minimos para os tipos primitivos sao:\n";
        minimos = minimos.concat("byte: -128\n");
        minimos = minimos.concat("short: -32.768\n");
        minimos = minimos.concat("int: -2.147.483.648\n");
        minimos = minimos.concat("long: -9.223.372.036.854.775.808\n");
        minimos = minimos.concat("float: -3,4028E + 38\n");
        minimos = minimos.concat("double: -1,7976E + 308\n");
        System.out.println(minimos);
    }

    public void selecionarSubTopico() {
        int numeroSubTopico;
        String texto = "Digite o número conrrespondente ao subtópico de tipos de variáveis que queria saber:\n";
        texto = texto.concat("1. Tipos Primitivos\n");
        texto = texto.concat("2. ValoresMaximos\n");
        texto = texto.concat("3. Valores Minimos\n");
        texto = texto.concat("Digite qualquer outro número para sair\n");
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        numeroSubTopico = scanner.nextInt();

        while ((numeroSubTopico < 4) && (numeroSubTopico > 0)) {
            switch (numeroSubTopico) {
                case 1:
                    imprimirTiposPrimitivos();
                    break;

                case 2:
                    imprimirValoresMaximos();
                    break;

                case 3:
                    imprimirValoresMinimos();
                    break;

            }

            System.out.println(texto);
            numeroSubTopico = scanner.nextInt();
        }
    }
}
