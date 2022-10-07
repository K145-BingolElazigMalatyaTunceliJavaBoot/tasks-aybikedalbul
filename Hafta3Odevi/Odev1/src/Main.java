import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Oda[] odalar = new Oda[2];
        odalar[0] = new Oda();
        odalar[1] = new Oda();

        odalar[0].meyve_list.add(new Meyve("Elma" , 3));
        odalar[0].meyve_list.add(new Meyve("Kiraz" , 5));
        odalar[1].meyve_list.add(new Meyve("Armut" , 7));

        Scanner scanner = new Scanner(System.in);
        double a=0,e=0,k=0,kg=0;

        while (true){
            System.out.print("Hangi meyveden istiyorsunuz?(Elma(e), Armut(a),Kiraz(k), Çıkış(ç) : ");
            String secim = scanner.nextLine();

            if (secim.equals("ç")) break;

            System.out.print("Kaç kilo almak istiyorsunuz?");
            kg = scanner.nextDouble();
            scanner.nextLine();

            if (secim.equals("a")) a+=kg;
            if (secim.equals("e")) e+=kg;
            if (secim.equals("k")) k+=kg;
        }
        if (a != 0) {
            double toplam_armut = 0;
            for(int i = 0; i < odalar.length; i++){
                int size = odalar[i].meyve_list.size();
                for(int j = 0; j < size; j++){
                    Meyve aranacak = odalar[i].meyve_list.get(j);
                    if(aranacak.isim == "Armut"){
                        toplam_armut+= aranacak.kg;
                    }
                }
            }
            if (toplam_armut < a){
                System.out.println("İstediğiniz miktarda armut bulunmamaktadır.");
            }
            else {
                toplam_armut -= a;
                System.out.println("Satışınız gerçekleşti.\nKalan armut: " + toplam_armut);
            }
        }

        if (e != 0) {
            double toplam_elma = 0;
            for(int i = 0; i < odalar.length; i++){
                int size = odalar[i].meyve_list.size();
                for(int j = 0; j < size; j++){
                    Meyve aranacak = odalar[i].meyve_list.get(j);
                    if(aranacak.isim == "Elma"){
                        toplam_elma+= aranacak.kg;
                    }
                }
            }
            if (toplam_elma < e){
                System.out.println("İstediğiniz miktarda elma bulunmamaktadır.");
            }
            else {
                toplam_elma = toplam_elma - e;
                System.out.println("Satışınız gerçekleşti.\nKalan elma: " + toplam_elma);
            }
        }

        if (k != 0) {
            double toplam_kiraz = 0;
            for(int i = 0; i < odalar.length; i++){
                int size = odalar[i].meyve_list.size();
                for(int j = 0; j < size; j++){
                    Meyve aranacak = odalar[i].meyve_list.get(j);
                    if(aranacak.isim == "Kiraz"){
                        toplam_kiraz+= aranacak.kg;
                    }
                }
            }
            if (toplam_kiraz < k){
                System.out.println("İstediğiniz miktarda kiraz bulunmamaktadır.");
            }
            else {
                toplam_kiraz -= k;
                System.out.println("Satışınız gerçekleşti.\nKalan kiraz: " + toplam_kiraz);
            }
        }
    }
}
