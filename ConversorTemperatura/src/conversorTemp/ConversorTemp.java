package conversorTemp;

import java.util.Scanner;

public class ConversorTemp {
    public static float celsiusToFahrenheit(float celsius){
        return (celsius * 9/5) + 32;
    }

    public static float fahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        float temp;
        int opt;

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Digite uma temperatura: ");
        temp = Entrada.nextFloat();

        System.out.println("Escolha uma operação: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");

        opt = Entrada.nextInt();

        if(opt == 1)
            System.out.println("Resultado: " + celsiusToFahrenheit(temp));
        else if(opt == 2)
            System.out.println("Resultado: " + fahrenheitToCelsius(temp));
        else
            System.out.println("Opção inválida!");

        Entrada.close();
    }
}
