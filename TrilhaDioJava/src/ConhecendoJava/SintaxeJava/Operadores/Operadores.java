package ConhecendoJava.SintaxeJava.Operadores;

import java.util.Scanner;

public class Operadores {
        public void imprimirOperadorDeAtribuicao() {
                String operadorDeAtribuicao = "\nO operador de atribuição é representado pelo simbolo de igualdade =\n";
                operadorDeAtribuicao = operadorDeAtribuicao.concat("Exemplos:\n");
                operadorDeAtribuicao = operadorDeAtribuicao.concat("String nome = \"GLEYSON\";\n");
                operadorDeAtribuicao = operadorDeAtribuicao.concat("int idade = 22;\n");
                operadorDeAtribuicao = operadorDeAtribuicao.concat("double peso = 68.5;\n");
                operadorDeAtribuicao = operadorDeAtribuicao.concat("char sexo = 'M';\n");
                operadorDeAtribuicao = operadorDeAtribuicao.concat("boolean doadorOrgao = false;\n");
                operadorDeAtribuicao = operadorDeAtribuicao.concat("Date dataNascimento = new Date();\n");
                System.out.println(operadorDeAtribuicao);
        }

        public void imprimirOperadoresAritimeticos() {
                String operadoresAritimeticos = "\nOs operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão)\n";
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
                System.out.println(operadoresAritimeticos);
        }

        public void imprimirOperadoresUnarios() {
                String operadoresUnarios = "\nOs operadores unários realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.\n";
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
                System.out.println(operadoresUnarios);
        }

        public void imprimirOperadoresLogicos() {
                String operadoresLogicos = "\nOs operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.\n";
                operadoresLogicos = operadoresLogicos.concat("&& Operador Lógico \"E\"\n");
                operadoresLogicos = operadoresLogicos.concat("|| Operador Lógico \"OU\"\n");
                operadoresLogicos = operadoresLogicos.concat("if(condicao1 && condicao2)\n");
                operadoresLogicos = operadoresLogicos
                                .concat("       System.out.print(\"Os dois valores precisam ser verdadeiros\");\n");
                operadoresLogicos = operadoresLogicos.concat("if(condicao1 || condicao2)\n");
                operadoresLogicos = operadoresLogicos
                                .concat("       System.out.print(\"Um dos valores precisa ser verdadeiro\");\n");
                System.out.println(operadoresLogicos);
        }

        public void imprimirOperadoresRelacionais() {
                String operadoresRelacionais = "\nOs operadores relacionais, avaliam a relação entre duas variáveis ou expressões.\n";
                operadoresRelacionais = operadoresRelacionais
                                .concat("== Quando desejamos verificar se uma variável é IGUAL A outra.\n");
                operadoresRelacionais = operadoresRelacionais
                                .concat("!= Quando desejamos verificar se uma variável é DIFERENTE da outra.\n");
                operadoresRelacionais = operadoresRelacionais
                                .concat("> Quando desejamos verificar se uma variável é MAIOR QUE a outra.\n");
                operadoresRelacionais = operadoresRelacionais
                                .concat(">= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.\n");
                operadoresRelacionais = operadoresRelacionais
                                .concat("< Quando desejamos verificar se uma variável é MENOR QUE outra.\n");
                operadoresRelacionais = operadoresRelacionais
                                .concat("<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.\n");
                System.out.println(operadoresRelacionais);
        }

        public void selecionarSubTopico() {
                int numeroSubTopico;
                String texto = "\nDigite o número conrrespondente ao subtópico de tipos de operadores que queria saber:\n";
                texto = texto.concat("1. Operador de atribuicao\n");
                texto = texto.concat("2. Operadores aritimeticos\n");
                texto = texto.concat("3. Operadores unarios\n");
                texto = texto.concat("4. Operadores logicos\n");
                texto = texto.concat("5. Operadores relacionais\n");
                texto = texto.concat("Digite qualquer outro número para sair\n");
                System.out.println(texto);

                Scanner scanner = new Scanner(System.in);
                numeroSubTopico = scanner.nextInt();

                while ((numeroSubTopico < 4) && (numeroSubTopico > 0)) {
                        switch (numeroSubTopico) {
                                case 1:
                                        imprimirOperadorDeAtribuicao();
                                        break;

                                case 2:
                                        imprimirOperadoresAritimeticos();
                                        break;

                                case 3:
                                        imprimirOperadoresUnarios();
                                        break;

                                case 4:
                                        imprimirOperadoresRelacionais();
                                        break;

                                case 5:
                                        imprimirOperadoresLogicos();
                                        break;

                        }

                        System.out.println(texto);
                        numeroSubTopico = scanner.nextInt();
                }
        }
}
