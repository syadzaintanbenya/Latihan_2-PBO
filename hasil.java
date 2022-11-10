package tugas2;

public class hasil {
   public static void main(String[] args) {
    
    //upcasting
    Elemen    s = new Asdos ("Fairuzikan", 23, 4);
    Dosen     y = new Dosen ("Raja OP Danamik",5);
    Elemen    a = new Asdos ("Angel-chan", 17, 13);
    Mahasiswa d = new Mahasiswa ("Firman", 20);
    Elemen    z = new Mahasiswa ("Nid to pass this sem", 23 );
    Elemen    i = new Dosen ("Nivotko", 3);


    s.display();
    y.display();
    a.display();
    d.display();
    z.display();
    i.display();

//untuk menampilkan total
int total = s.getJamSibuk() + y.getJamSibuk() + a.getJamSibuk() + d.getJamSibuk() + z.getJamSibuk() + i.getJamSibuk() ;
System.out.println("Total jam sibuk elemen Fasilikom adalah"+ total);
    }
}
