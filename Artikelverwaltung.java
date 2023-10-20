import java.util.ArrayList;

public class Artikelverwaltung {
    
    public static void main(String[] args){

        Artikel beignet = new Artikel(0001, 25, "beignet", 001);
        Artikel porcs = new Artikel(002, 50, "porcs", 123);

        ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
        artikelListe.add(beignet);
        artikelListe.add(porcs);
        artikelListe.remove(0);
        artikelListe.add(beignet);

        for(Artikel a : artikelListe){
            System.out.println(a);
        }
        
    }
}
