
public class AsalSayi {
    public static void main(String[] args) {

        int toplam = 0;
        boolean asalmi = true;

        for (int i = 3; i < 100; i++){

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalmi = false;
                    break;
                }
            }
            if(asalmi == true) {
                toplam += i;
            }
            asalmi = true;
        }

        System.out.println("3-100 arasındaki asal sayıların toplamı:  " + toplam);

    }
}
