package ConhecendoJava.SintaxeJava.Operadores;

public class Operadores {
    public String operadorDeAtribuicao() {
        String operadorDeAtribuicao = "O operador de atribuição é representado pelo simbolo de igualdade =\n";
        operadorDeAtribuicao = operadorDeAtribuicao.concat("Exemplos:\n");
        operadorDeAtribuicao = operadorDeAtribuicao.concat("String nome = \"GLEYSON\";\n");
        operadorDeAtribuicao = operadorDeAtribuicao.concat("int idade = 22;\n");
        operadorDeAtribuicao = operadorDeAtribuicao.concat("double peso = 68.5;\n");
        operadorDeAtribuicao = operadorDeAtribuicao.concat("char sexo = 'M';\n");
        operadorDeAtribuicao = operadorDeAtribuicao.concat("boolean doadorOrgao = false;\n");
        operadorDeAtribuicao = operadorDeAtribuicao.concat("Date dataNascimento = new Date();\n");
        return (operadorDeAtribuicao);
    }

    public String operadoresAritimeticos() {
        String operadoresAritimeticos = "Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão)\n";
        operadoresAritimeticos = operadoresAritimeticos.concat("double soma = 10.5 + 15.7;\n");
        operadoresAritimeticos = operadoresAritimeticos.concat("int subtração = 113 - 25;\n");
        operadoresAritimeticos = operadoresAritimeticos.concat("int multiplicacao = 20 * 7;\n");
        operadoresAritimeticos = operadoresAritimeticos.concat("int divisao = 15 / 3;\n");
        operadoresAritimeticos = operadoresAritimeticos.concat("int modulo = 18 % 3;\n");
        operadoresAritimeticos = operadoresAritimeticos.concat("double resultado = (10 * 7) + (20/4);\n");
        operadoresAritimeticos = operadoresAritimeticos.concat(
                "\nATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.\n");
        operadoresAritimeticos = operadoresAritimeticos
                .concat("Exemplo: String nomeCompleto = \"LINGUAGEM\" + \"JAVA\";\n");
        return (operadoresAritimeticos);
    }

    public String operadoresUnarios() {
        String operadoresUnarios = "Os operadores unários realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.\n";
        operadoresUnarios = operadoresUnarios.concat(
                "(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;\n");
        operadoresUnarios = operadoresUnarios
                .concat("(-) Operador unário de valor negativo – nega um número ou expressão aritmética;\n");
        operadoresUnarios = operadoresUnarios
                .concat("(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;\n");
        operadoresUnarios = operadoresUnarios
                .concat("(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;\n");
        operadoresUnarios = operadoresUnarios
                .concat("(!) Operador unário lógico de negação – nega o valor de uma expressão booleana.\n");
        operadoresUnarios = operadoresUnarios.concat("\nExemplos:\n");
        operadoresUnarios = operadoresUnarios
                .concat("int numero = 5;\n'Imprimindo o numero negativo'\nSystem.out.println(- numero);\n");
        operadoresUnarios = operadoresUnarios.concat(
                "'incrementando numero em mais 1 numero, imprime 6'\nnumero ++;\nSystem.out.println(numero);\n");
        operadoresUnarios = operadoresUnarios.concat(
                "'inverte valor lógico'\nboolean verdadeiro = true;\nSystem.out.println(\"Inverteu\" + !verdadeiro);\n");
        return (operadoresUnarios);
    }
}
