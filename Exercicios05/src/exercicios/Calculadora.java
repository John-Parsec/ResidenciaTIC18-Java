package exercicios;

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
            int a, b;
            String opt;

            Scanner Entrada = new Scanner(System.in);

            System.out.println("Digite dois números inteiros: ");
            a = Entrada.nextInt();
            b = Entrada.nextInt();

            System.out.println("Escolha uma operação: ");
            System.out.println("A - Adição");
            System.out.println("S - Subtração");
            System.out.println("M - Multiplicação");
            System.out.println("D - Divisão");

            opt = Entrada.next(); 

            if(opt == "A")
                System.out.println("Resultado: " + soma(a, b));
            else if(opt == "S")
                System.out.println("Resultado: " + subtracao(a, b));
            else if(opt == "M")
                System.out.println("Resultado: " + multiplicacao(a, b));
            else if(opt == "D")
                System.out.println("Resultado: " + divisao(a, b));
            else
                System.out.println("Opção inválida!");

            Entrada.close();
        }
}