package ConhecendoJava.SintaxeJava.PalavrasReservadas;

public class PalavrasReservadas {
    public void imprimirPalavrasReservadas() {
        String imprimirPalavrasReservadas = "Palavras reservadas, são identificadores de uma linguagem que já possuem uma finalidade específica, portanto, não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.\n";

        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nAbstract\nAssert");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nBoolean\nBreak\nByte");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nCase\nCatch\nChar\nClass\nConst\nContinue");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nDefault\nDo\nDouble");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nElse\nEnum\nExtends");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nFinal\nFinally\nFloat\nFor");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nGoto");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas
                .concat("\nIf\nImplements\nImport\nInstanceof\nInt\nInterfaces");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nLong");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nNative\nNew");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nPackage\nPrivate\nProtected\nPublic");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nReturn");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas
                .concat("\nShort\nStatic\nStrictfp\nSuper\nSwitch\nSynchronized");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nThis\nThrow\nThrows\nTransient\nTry");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nVoid\nVolatile");
        imprimirPalavrasReservadas = imprimirPalavrasReservadas.concat("\nWhile\n");
        System.out.println(imprimirPalavrasReservadas);
    }
}
