package ÇalışanlarProgramı;

public class Yazılımcı extends Calisan {

    private String diller;

    public Yazılımcı(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);

        this.diller = diller;
    }
    public void formatAt( String işletim_sistemi) {
        System.out.println(getAd() + " " + işletim_sistemi +"'i yüklüyor.");

    }
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("yazılımcının bildiği diller :  " + diller);
    }
    
}
