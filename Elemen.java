package tugas2;

public class Elemen {
    
  private String nama ;

    Elemen (String nama) {
        this.nama = nama ;
        
    }
// getter
    public String getNama (){
        return this.nama;
    }
    public int getJamSibuk (){
        return 0;
    }
// setter
    public void setNama(String nama) {
        this.nama = nama ;
    }

// method umum
   public void display() {
    }
}
