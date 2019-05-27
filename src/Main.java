public class Main {

    public static void main(String[] args) {


        Datum datum = new Datum(28, 2, 2007);
        System.out.println("  ");
        Persoon persoon = new Persoon(111111111, "Jens", "Slauerhoff", "15/05/2015", 'v');
        Persoon persoon2 = new Persoon(111111111, "Jens", "Slauerhoff", "15/05/2015", 'v');
        System.out.println(persoon.getGeslacht());
        System.out.println(persoon.getGeboortedatum());
        persoon.setGeboortedatum("15/13/2015");
        System.out.println(persoon.getGeboortedatum());
        System.out.println(persoon.toString());
        System.out.println("  ");

        Artikel artik = new Artikel("doos", 5);
        Artikel artik2 = new Artikel("doos2", 10);
        Artikel artik3 = new Artikel("doos3", 200);

        System.out.println(artik.toString());
        System.out.println("  ");

        Dienblad dienblad = new Dienblad(persoon);
        Dienblad dienblad2 = new Dienblad(persoon2);
        dienblad.voegToe(artik);
        dienblad.voegToe(artik2);
        dienblad.voegToe(artik3);
        dienblad.getAantalArtikelen();
        dienblad.getTotaalPrijs(artik);

        KassaRij kassa = new KassaRij();
        kassa.sluitAchteraan(dienblad);
        kassa.sluitAchteraan(dienblad2);
        kassa.eerstePersoonInRij();
        kassa.sluitAchteraan(dienblad);



    }
}
