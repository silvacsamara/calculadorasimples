// Calculadora simples para operações matemáticas entre dois números, utilizando switch case.

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLES");
        System.out.println("=================");
        System.out.println("===== MENU ======");
        System.out.println("=================");
        System.out.println("SOMA: 1         |");
        System.out.println("SUBTRAÇÃO: 2    |");
        System.out.println("MULTIPLICAÇÃO: 3|");
        System.out.println("DIVISÃO: 4      |");
        System.out.println("=================");

        System.out.println("Digite o número referente a opção desejada: ");
        int numero = scanner.nextInt();

        switch(numero) {
            case 1:
                System.out.println("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int soma = numero1 + numero2;

                System.out.println("Resultado: " + soma);
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                int numero3 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int numero4 = scanner.nextInt();
                int soma1 = numero3 - numero4;

                System.out.println("Resultado: " + soma1);
                break;

            case 3:
                System.out.println("Digite o primeiro número: ");
                int numero5 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int numero6 = scanner.nextInt();
                int soma2 = numero5 * numero6;

                System.out.println("Resultado: " + soma2);
                break;
            case 4:
                System.out.println("Digite o primeiro número: ");
                int numero7 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int numero8 = scanner.nextInt();
                int soma3 = numero7 / numero8;

                System.out.println("Resultado: " + soma3);
                break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");

        }
    }
}

