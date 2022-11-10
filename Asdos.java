package tugas2;

public class Asdos extends Mahasiswa {
    private int jamNgasdos; 

public Asdos (String nama, int sks, int jamNgasdos) {
    super(nama,sks);// downcasting
    this.jamNgasdos = jamNgasdos;
}
public int jamNgasdos(){
    return this.jamNgasdos;
}
public int getJamSibuk () {
    return super.getJamSibuk() + jamNgasdos;  
}
public void display(){
    System.out.println(getNama() + "adalah seorang asdos dengan jam sibuk" + getJamSibuk());
}

}
