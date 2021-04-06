import java.util.ArrayList;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int [] listTemperatura = new int[30];

        System.out.println("Sistema de inserção de temperaturas");
        Random random = new Random();

        for (int i = 0; i < listTemperatura.length; i++) {
            listTemperatura[i] = random.nextInt(30);
        }
        Integer result = 0;
        for(Integer item : listTemperatura) {
            result += item;
        }
        int media = result / listTemperatura.length;
        System.out.println("A média das temperaturas é igual a: " + media);
    }
}
