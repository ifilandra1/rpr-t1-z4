package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testtoString() {
        Student s= new Student ("ibrahim", "filandra", 18009);
        assertEquals(""+s.prezime+" "+s.ime+" ("+s.brindexa+")", s.toString());
    }

    @Test
    void getPrezime() {
        Student s= new Student ("ibrahim", "filandra", 18009);

        assertEquals("filandra",s.getPrezime() );
    }

    @Test
    void setPrezime() {
        Student s= new Student ("ibrahim", "filandra", 18009);

        assertThrows(IllegalArgumentException.class, ()->
                s.setPrezime("12345")
        );

    }

    @Test
    void getIme() {

        Student s= new Student ("ibrahim", "filandra", 18009);

        assertEquals("ibrahim",s.getPrezime() );

    }

    @Test
    void setIme() {

        Student s= new Student ("ibrahim", "filandra", 18009);

        assertThrows(IllegalArgumentException.class, ()->
                s.setIme("")
        );

    }

    @Test
    void getBrindexa() {

        Student s= new Student ("ibrahim", "filandra", 18009);

        assertEquals(18009,s.getBrindexa() );

    }

    @Test
    void setBrindexa() {

        Student s= new Student ("ibrahim", "filandra", 18009);

        assertThrows(IllegalArgumentException.class, ()->
                s.setBrindexa(123456)
        );

    }
}