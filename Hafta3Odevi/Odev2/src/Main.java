import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Firmalar[] firmalars = new Firmalar[2];
        firmalars[0] = new Firmalar("THY",true,true);
        firmalars[1] = new Firmalar("Pegasus",true,false);

        firmalars[0].ucusList.add(new Ucus("Elazığ","İstanbul","10.12.2022",true));
        firmalars[0].ucusList.add(new Ucus("Ankara","London","1.7.2022",false));
        firmalars[1].ucusList.add(new Ucus("Ankara","Norway","7.2.2022",false));
        firmalars[1].ucusList.add(new Ucus("Ankara","İzmir","7.2.2022",true));

        for(int firmalar = 0; firmalar < firmalars.length; firmalar++){
            for(int ucuslar = 0; ucuslar < firmalars[firmalar].ucusList.size(); ucuslar++){
                firmalars[firmalar].ucusList.get(ucuslar).koltukList.add(new Koltuk("1A",true));
                firmalars[firmalar].ucusList.get(ucuslar).koltukList.add(new Koltuk("2A",false));
                firmalars[firmalar].ucusList.get(ucuslar).koltukList.add(new Koltuk("3A",true));
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Firma seçiniz (THY:t, Pegasus:p) :");
        String firma_secimi = scanner.nextLine();

        List<Ucus> ucusList;
        if(firma_secimi.equals("t")){
            ucusList = firmalars[0].ucusList;
        }else if(firma_secimi.equals("p")){
            ucusList = firmalars[1].ucusList;
        }else{
            ucusList = new ArrayList<Ucus>();
        }

        int firma_id = 0;
        if(firma_secimi.equals("t")){
            firma_id = 0;
        }else if(firma_secimi.equals("p")){
            firma_id = 1;
        }

        for(int i = 0; i < ucusList.size(); i++){
            String yemekdurum = "";
            if(firmalars[firma_id].ucusList.get(i).yurtici_mi){
                // Yurtiçi
                if(firmalars[firma_id].yurtici_yemek){
                    yemekdurum = "Yemekli";
                }else{
                    yemekdurum = "Yemeksiz";
                }
            }else{
                // yurtdışı
                if(firmalars[firma_id].yurdisi_yemek){
                    yemekdurum = "Yemekli";
                }else{
                    yemekdurum = "Yemeksiz";
                }
            }
            System.out.println("["+i+"] "+ucusList.get(i).nereden+" - "+ucusList.get(i).nereye+" / "+ucusList.get(i).tarih+" / "+yemekdurum);
        }
        System.out.print("Hangi uçuşu almak istiyorsunuz?  :");
        int secim = scanner.nextInt();

        for(int koltuk = 0; koltuk < firmalars[firma_id].ucusList.get(secim).koltukList.size(); koltuk++){
            Koltuk klt = firmalars[firma_id].ucusList.get(secim).koltukList.get(koltuk);
            String tip = "";
            if(klt.ekonimi_mi){
                tip = "Ekonomi";
            }else{
                tip = "Business";
            }
            System.out.println("["+koltuk+"]"+klt.koltuk_ismi+" "+tip);
        }
        System.out.print("Koltuk seçiniz: ");
        int koltuk_secimi = scanner.nextInt();
        if(koltuk_secimi <  firmalars[firma_id].ucusList.get(secim).koltukList.size()){
            System.out.println("Koltuğu başarıyla aldınız!");
        }else{
            System.out.println("Böyle bir koltuk bulunmamaktadır.");
        }



    }
}
