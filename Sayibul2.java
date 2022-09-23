import java.util.Random;

public class Sayibul2 {
    public static void main(String[] args){
        Random random = new Random();

        for (int i = 0; i < 500; i++){
            int sayi = random.nextInt(500);
            if (sayi > 50 && sayi < 100){
                System.out.println(i + ".seçimde 50-100 arası bir sayı bulunmuştur.(" + sayi + ")" );
                break;
            }

        }
    }
}
