import java.util.Scanner;

public class Algoritimo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = input.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = input.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = input.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo.");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("NÃO formam um triângulo.");
        }
        input.close();
    }
}
