import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] listInt = new int[10];
        Random random = new Random();

        System.out.println("Sistema de cálculo de inteiros\n");

        for (int i = 0; i < listInt.length; i++) {
            listInt[i] = random.nextInt(30);
        }

        for (int i = 0; i < listInt.length; i++) {
            System.out.println("Números divisores de " + listInt[i]);
            for (int j = 1; j <= listInt[i]; j++) {
                if (listInt[i] % j == 0) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }
}
