public class SayiBul {
    //200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını bulan program.
    public static void main(String[] args){

        int toplam = 0;

        for (int i = 1; i < 10; i++){
            if (i % 3 == 0) {
                continue;
            }
            else {
                toplam += i;
            }
        }
        System.out.println("200-500 arasındaki sayıların toplamı:  " + toplam);
    }
}
