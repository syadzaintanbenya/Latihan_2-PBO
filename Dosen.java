package tugas2;

public class Dosen extends Elemen {
    public int jamSibuk;
    private int jumlahHariKerja;

public Dosen (String nama, int jumlahHariKerja){
    super(nama);//downcasting
    this.jumlahHariKerja = jumlahHariKerja;
}

// untuk ngambil jam sibuk = jumlah hari kerja * 8
public int getJamSibuk () {
    return this.jumlahHariKerja * 8 ;  
}
public void display(){
    System.out.println(getNama() + "adalah seorang dosen dengan jam sibuk" + getJamSibuk());
}


}
