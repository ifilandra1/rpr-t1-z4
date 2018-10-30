package ba.unsa.etf.rpr;

public class Predmet {

    final int maxbroj;
    private Student [] niz;
    String naziv, sifra;
    private int trenutnibr;

    public Predmet ( int maxbroj, String naziv, String sifra) {
        this.maxbroj=maxbroj;
        niz=new Student [maxbroj];
        this.naziv=naziv; this.sifra=sifra;
        trenutnibr=0;
    }

    public String toString() {
        String s=new String();
        for(int i=0;i<trenutnibr;i++){
            s+=i+1+"."+niz[i].prezime+" "+niz[i].ime+" ("+niz[i].brindexa+")\n";

        }

        return s;
    }



    public void upisi ( Student s ) {
        if(trenutnibr!=maxbroj) {

            niz[trenutnibr]=s;
            trenutnibr++;
        }
    }

    public void ispisi (Student s) {
        int i=0;
        for(; i !=trenutnibr; i++) {

            if(niz[i].getIme().equals( s.getIme()) && niz[i].getPrezime().equals(s.getPrezime()) && niz[i].getBrindexa() ==s.getBrindexa() )
                break;

        }
        for(int k=i; k<trenutnibr-1; k++) {
            niz[k]=niz[k+1];
        }
        trenutnibr--;

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void ispisstudenata() {

        for(int i=0;i!=trenutnibr; i++) {

            System.out.println(""+ i+1 + ". "+ niz[i].getPrezime()+ " " + niz[i].getIme()+" ("+niz[i].getBrindexa()+")"  );
        }


    }



}
