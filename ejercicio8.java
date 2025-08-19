public class Sucesion {
    public static void main(String[] args) {
        int[] sucesion = {1, 1, 2, -1, 1, -2, -1};
        int n = sucesion.length;

        int[] siguientes = {1, 2, -1};

        System.out.print("La sucesión completa es: ");
        for (int num : sucesion) {
            System.out.print(num + " ");
        }
        for (int num : siguientes) {
            System.out.print(num + " ");
        }
    }
}


