package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void testtoString() {
        Predmet p=new Predmet(10,"matematika2","im2");
        Student s= new Student ("ibrahim", "filandra", 18009);
        Student s2= new Student ("ibrahim", "alispahic", 17456);
        Student s3=new Student("Rijad","Sehovic",17773);
        p.upisi(s); p.upisi(s2); p.upisi(s3);

        assertEquals("1. filandra ibrahim (18009)\n2.alispahic ibrahim (17456)\n3.sehovic rijad (17773)",p.toString());
    }

    @Test
    void upisi() {
        Student s= new Student ("ibrahim", "filandra", 18009);
        Student s2= new Student ("ibrahim", "alispahic", 18009);

        Predmet p=new Predmet(10,"matematika2","im2");
        p.upisi(s);
        assertThrows(IllegalArgumentException.class, ()-> p.upisi(s2));
        //2 studenta imaju isti broj indexa
    }

    @Test
    void ispisi() {

        Student s= new Student ("ibrahim", "filandra", 18009);
        Student s2= new Student ("ibrahim", "alispahic", 17754);
        Predmet p=new Predmet(10,"matematika2","im2");
        p.upisi(s);
        assertThrows(IllegalArgumentException.class, ()->p.ispisi(s2));

        //student s2 nije upisan a trazi se ispis
    }

    @Test
    void getNaziv() {
        Predmet p=new Predmet(10,"matematika2","im2");
        assertEquals("matematika2",p.getNaziv());
    }

    @Test
    void setNaziv() {
        Predmet p=new Predmet(10,"matematika2","im2");
        assertThrows(IllegalArgumentException.class, ()->p.setNaziv("1234"));
        //naziv predmeta uopste nema slova
    }

    @Test
    void getSifra() {
        Predmet p=new Predmet(10,"matematika2","im2");
        assertEquals("im2",p.getSifra());
    }

    @Test
    void setSifra() {
        Predmet p=new Predmet(10,"matematika2","im2");
        assertThrows(IllegalArgumentException.class, ()->p.setNaziv(""));
        //sifra predmeta prazan string
    }

    @Test
    void ispisstudenata() {

    }
}