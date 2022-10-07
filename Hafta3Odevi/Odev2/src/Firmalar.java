import java.util.ArrayList;
import java.util.List;

public class Firmalar {
    String isim;
    boolean yurtici_yemek;
    boolean yurdisi_yemek;
    List<Ucus> ucusList = new ArrayList<Ucus>();

    public Firmalar(String isim, boolean yurdisi_yemek, boolean yurtici_yemek){
        this.isim = isim;
        this.yurdisi_yemek = yurdisi_yemek;
        this.yurtici_yemek = yurtici_yemek;
    }

}
