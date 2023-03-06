package ConhecendoJava.SintaxeJava.Escopo;

public class Escopo {
    public void imprimirEscopo() {
        String imprimirEscopo = "\n";
        imprimirEscopo = imprimirEscopo
                .concat("O escopo pode ser entendido como,o ambiente onde uma variável pode ser acessada.\n");
        imprimirEscopo = imprimirEscopo.concat("Podemos ter escopos de métodos e classes:\n");
        imprimirEscopo = imprimirEscopo
                .concat("    Escopo de classe (Quando a varável é criada dentro de uma classe)\n");
        imprimirEscopo = imprimirEscopo
                .concat("    Escopo de mátodo (Quando a varável é criada dentro de um método)\n");
        imprimirEscopo = imprimirEscopo.concat("\n");
        System.out.println(imprimirEscopo);
    }
}
