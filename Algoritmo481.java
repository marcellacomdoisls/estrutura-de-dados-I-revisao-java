import java.util.Scanner;

public class Algoritmo481 {
    public static void main(String[] args) {
        int num, base, c;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite número maior ou igual a 0: ");
        num = teclado.nextInt();
        while (num < 0) {
            System.out.print("\nNúmero negativo. Digite número maior ou igual a 0: ");
            num = teclado.nextInt();
        }
        System.out.print("\nDigite a base em deseja representá-lo(2-10): ");
        base = teclado.nextInt();
        while (base < 2 || base > 10) {
            System.out.print("\nNão sei converter. Digite a base em que deseja representá-lo(2-10): ");
            base = teclado.nextInt();
        }
        c = converte(num, base);
        System.out.println("\nNúmero em decimal: " + num);
        System.out.println("\nNúmero na base " + base + ": " + c);

        teclado.close();
    }

    public static int converte(int nnum, int nbase) {
        int nb, r, b;
        b = 0;
        nb = 0;
        while (nnum >= nbase) {
            r = nnum % nbase;
            nb = nb + (int) Math.pow(10, b) * r;
            nnum = nnum / nbase;
            b++;
        }
        nb = nb + (int) Math.pow(10, b) * nnum;
        return nb;
    }
}
