import java.util.Scanner;

public class Program {

    public Student [] nizstudenata = new Student [10];
    public Predmet [] nizpredmeta = new Predmet [10];
    int brstudenata=0, brpredmeta=0;



    public static void main (String [] args) {

        Program program = new Program();
        program.main2();

    }

    public void main2 () {

        glavna: while(true) {
            System.out.println("Meni: “1. Kreiranje novog predmeta\n2. Kreiranje novog studenta\n 3. Upis studenta na predmet \n4.Ispis studenta" +
                    "sa predmeta\n5.Brisanje studenta\n6.Brisanje predmeta\n 7. Ispis studenata na predmetu\n 8.Kraj programa");


            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if (n==8) break glavna;

            if(n==1) {
                System.out.println("Unesite naziv predmeta");
                String naziv=scan.next();
                System.out.println("Unesite sifru predmeta");
                String sifra=scan.next();
                System.out.println("Unesite maksimalan broj studenata");
                int br=scan.nextInt();
                nizpredmeta[brpredmeta] = new Predmet (br, naziv, sifra);

            }
            if(n==2) {

                System.out.println("Unesite ime studenta");
                String ime=scan.next();
                System.out.println("Unesite prezime studenta");
                String prezime=scan.next();
                System.out.println("Unesite broj indexa");
                int broj=scan.nextInt();
                nizstudenata[brstudenata] = new Student (ime, prezime, broj );

            }

            if(n==3) {

                System.out.println("Unesite prezime studenta");
                String prezime = scan.next();
                System.out.println("Unesite naziv predmeta");
                String predmet=scan.next();
                 int i=0,j=0;
                for( ; i!=10; i++) if(nizstudenata[i].getPrezime().equals(prezime)) break;
                for(; j!=10; j++) if(nizpredmeta[j].getNaziv().equals(predmet))break;
               nizpredmeta[j].upisi( nizstudenata[i]);

            }

            if(n==4) {

                System.out.println("Unesite prezime studenta");
                String prezime = scan.next();
                System.out.println("Unesite naziv predmeta");
                String predmet=scan.next();
                int i=0,j=0;
                for( ; i!=10; i++) if(nizstudenata[i].getPrezime().equals(prezime)) break;
                for(; j!=10; j++) if(nizpredmeta[j].getNaziv().equals(predmet))break;
                nizpredmeta[j].ispisi( nizstudenata[i]);

            }

            if (n==5) {

                System.out.println ("Unesite prezime studenta");
                String prezime= scan.next();
                int i=0;
                for( ; i!=10; i++) if(nizstudenata[i].getPrezime().equals(prezime)) break;



                for(int k=i; k< brstudenata -1; k++) {

                       nizstudenata[k]=nizstudenata[k+1];
                }
                brstudenata=brstudenata-1;


            }

            if (n==6) {

                System.out.println ("Unesite naziv predmeta");
                String naziv= scan.next();
                int i=0;
                for( ; i!=10; i++) if(nizpredmeta[i].getNaziv().equals(naziv)) break;

                for(int k=i; k< brpredmeta ; k++) {

                    nizpredmeta[k]=nizpredmeta[k+1];
                }
                brpredmeta=brpredmeta-1;

            }

            if (n==7) {

                System.out.println("Unesite naziv predmeta");
                String naziv=scan.next();
                int i=0;
                for(; i!=10; i++) if ( nizpredmeta[i].getNaziv().equals(naziv)) break;
               nizpredmeta[i].ispisstudenata();


            }



        }

    }




}
