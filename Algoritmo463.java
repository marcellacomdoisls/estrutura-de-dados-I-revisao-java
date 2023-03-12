import java.util.Scanner;

public class Algoritmo463 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double angulo;
        double anguloEmRadianos;

        System.out.println("Digite o ângulo em graus: ");

        angulo = teclado.nextDouble();

        anguloEmRadianos = radiano(angulo);
        System.out.println("\nGraus: " + angulo);

        System.out.println("Radianos: " + anguloEmRadianos);

        teclado.close();
    }

    public static double radiano(double rang) {
        rang = ((rang * Math.PI)/180);

        return rang;

    }
}