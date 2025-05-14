import java.util.Scanner;

public class Algoritimo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = input.nextDouble();
        System.out.print("Digite a altura (m): ");
        double altura = input.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        if (imc < 18.5) {
            System.out.println(" Magreza");
        } else if (imc < 25) {
            System.out.println(" Normal");
        } else if (imc < 30) {
            System.out.println(" Sobrepeso");
        } else {
            System.out.println(" Obesidade");
        }
        input.close();
    }
}