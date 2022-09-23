import java.util.Scanner;

public class PuanHesap {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Puanınınızı Giriniz: ");
        int puan = scanner.nextInt();

        if (puan > 0 && puan < 35) {

            System.out.println("FF");
        } else if (puan >= 35 && puan <50) {
            System.out.println("DC");
        }else if (puan >= 50 && puan <70) {
            System.out.println("BB");
        }else {
            System.out.println("AA");
        }


    }
}
