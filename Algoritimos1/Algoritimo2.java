
import java.util.Scanner;

public class Algoritimo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do Etanol: ");
        double etanol = input.nextDouble();
        System.out.print("Digite o preço da Gasolina: ");
        double gasolina = input.nextDouble();
        double limite = gasolina * 0.7;
        if (etanol < limite) {
            System.out.println("É melhor Etanol.");
        } else {
            System.out.println("É melhor Gasolina.");
        }
        input.close();
    }
}
