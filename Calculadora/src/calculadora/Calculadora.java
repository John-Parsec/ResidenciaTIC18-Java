package calculadora;

import java.util.Scanner;

public class Calculadora {
        public static int soma(int a, int b){
            return a + b;
        }

        public static int subtracao(int a, int b){
            return a - b;
        }

        public static int multiplicacao(int a, int b){
            return a * b;
        }

        public static float divisao(int a, int b){
            return a / b;
        }

        public static void main(String[] args) {
            int a, b, opt;

            Scanner Entrada = new Scanner(System.in);

            System.out.println("Digite dois números inteiros: ");
            a = Entrada.nextInt();
            b = Entrada.nextInt();

            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            opt = Entrada.nextInt();

            if(opt == 1)
                System.out.println("Resultado: " + soma(a, b));
            else if(opt == 2)
                System.out.println("Resultado: " + subtracao(a, b));
            else if(opt == 3)
                System.out.println("Resultado: " + multiplicacao(a, b));
            else if(opt == 4)
                System.out.println("Resultado: " + divisao(a, b));
            else
                System.out.println("Opção inválida!");

            Entrada.close();

        }
}
