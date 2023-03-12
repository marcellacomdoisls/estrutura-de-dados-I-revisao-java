import java.util.Scanner;

public class Algoritmo467 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double z, logaritmando, base;
        int i;

        for (i = 1; i <= 3; i++) {
            System.out.println("\nDigite o logaritmando maior do que 0: ");
            logaritmando = teclado.nextDouble();

            while (logaritmando <= 0) {
                System.out.println("\nInválido. Digite o logaritmando maior do que 0: ");
                logaritmando = teclado.nextDouble();
            }

            System.out.println("\nDigite a base maior que 0 e diferente de 1: ");
            base = teclado.nextDouble();

            while (base <= 0 || base == 1) {
                System.out.println("\nInválido. Digite a base maior que 0 e diferente de 1: ");
                base = teclado.nextDouble();
            }

            double log = calcularLog(logaritmando, base);
            System.out.println("\nLogaritmo: " + log);
            z = log;
            System.out.println("z = " + z);

            teclado.close();
        }

        System.out.println("\n");
    }

    public static double calcularLog(double base, double expo) {
        double i = Math.log(base) / Math.log(expo);
        return i;
    }
}
