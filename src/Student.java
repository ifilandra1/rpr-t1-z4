
public class Student {

    String ime, prezime;
    int brindexa;


    public Student ( String ime, String prezime, int brindexa ) {

         this.ime=ime; this.prezime=prezime; this.brindexa=brindexa;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrindexa() {
        return brindexa;
    }

    public void setBrindexa(int brindexa) {
        this.brindexa = brindexa;
    }


}
