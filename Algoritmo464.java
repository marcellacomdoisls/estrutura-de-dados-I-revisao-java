import java.util.Scanner;

public class Algoritmo464 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double angulo;
        double radianosEmGraus;

        System.out.println("Digite o ângulo em radianos: ");

        angulo = teclado.nextDouble();

        radianosEmGraus = graus(angulo);
        System.out.println("\nGraus: " + angulo);

        System.out.println("\nRadianos: " + radianosEmGraus);

        teclado.close();
    }

    public static double graus(double gang) {
        gang = ((gang * 180)/Math.PI);

        return gang;

    }
}