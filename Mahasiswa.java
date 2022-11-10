package tugas2;

public class Mahasiswa extends Elemen {
    private int sks;

    public Mahasiswa (String nama, int sks ) {
        super(nama);//downcasting karena dari turunan class elemen ke class mahasiswa
        this.sks = sks;
    }
    
    public int getJamSibuk(){
        return sks * 3;
    }

    public void display () {
        System.out.println(getNama() + "adalah seorang mahasiswa denagn jam sibuk" + getJamSibuk());
    }
}
