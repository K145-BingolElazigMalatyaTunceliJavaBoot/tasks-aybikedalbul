import java.util.ArrayList;
import java.util.List;

public class Ucus {
    String nereden;
    String nereye;
    String tarih;
    boolean yurtici_mi;

    List<Koltuk> koltukList = new ArrayList<Koltuk>();

    public Ucus(String nereden, String nereye, String tarih, boolean yurtici_mi){
        this.nereden = nereden;
        this.nereye = nereye;
        this.tarih = tarih;
        this.yurtici_mi = yurtici_mi;
    }



}
