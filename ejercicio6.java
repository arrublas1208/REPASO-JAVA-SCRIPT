import java.util.Scanner;

public class SumaHasta1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaTotal = 0;
        int multiplosDe6 = 0;
        int sumaEntre1y10 = 0;

        while (sumaTotal < 1000) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();
            sumaTotal += num;

            if (num % 6 == 0) {
                multiplosDe6++;
            }

            if (num >= 1 && num <= 10) {
                sumaEntre1y10 += num;
            }
        }

        System.out.println("Cantidad de múltiplos de 6: " + multiplosDe6);
        System.out.println("Suma de números entre 1 y 10: " + sumaEntre1y10);
        System.out.println("Suma total: " + sumaTotal);
    }
}