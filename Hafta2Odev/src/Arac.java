public class Arac {

    public boolean isAylik;
    public boolean isGunluk;
    public String type;
    public int bagajKapasitesi;
    public boolean PriceType;
    public double GunlukUcret;
    public boolean DigerVatandas;
    public boolean Sirket;
    public double AylikKatsayi;

    public Arac(boolean isAylik, boolean isGunluk, String type, int bagajKapasitesi, boolean PriceType, double GunlukUcret, boolean DigerVatandas, boolean Sirket, double AylikKatsayi){
        this.isAylik = isAylik;
        this.isGunluk = isGunluk;
        this.type = type;
        this.bagajKapasitesi = bagajKapasitesi;
        this.PriceType = PriceType;
        this.GunlukUcret = GunlukUcret;
        this.DigerVatandas = DigerVatandas;
        this.Sirket = Sirket;
        this.AylikKatsayi = AylikKatsayi;
    }

    public Arac(boolean isAylik, boolean isGunluk, String type, int bagajKapasitesi, boolean PriceType, double GunlukUcret, boolean DigerVatandas, boolean Sirket){
        this.isAylik = isAylik;
        this.isGunluk = isGunluk;
        this.type = type;
        this.bagajKapasitesi = bagajKapasitesi;
        this.PriceType = PriceType;
        this.GunlukUcret = GunlukUcret;
        this.DigerVatandas = DigerVatandas;
        this.Sirket = Sirket;
    }
}
