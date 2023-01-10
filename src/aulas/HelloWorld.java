package aulas;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z, w;
        double e = 4.54646;

        // Exemplo Scanner e variáveis
        System.out.print("Informe o valor de x: ");
        x = scanner.nextInt();
        System.out.print("Informe o valor de y: ");
        y = scanner.nextInt();
        System.out.print("Informe o valor de z: ");
        z = scanner.nextInt();
        System.out.print("Informe o valor de w: ");
        w = scanner.nextInt();

        System.out.println("A soma de " + x + " + " + y + " = " + (x + y));

        // Formatar double
        System.out.printf("Valor de double formatado: %.2f", e);
    }
}
