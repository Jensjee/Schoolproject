import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
    private ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
    private double totaal = 0;
    private Persoon klant;

    /**
     * Constructor
     */
    public Dienblad() {
        // method body omitted

    }
    public Dienblad(Persoon klant) {
        this.klant = klant;
    }

    public Persoon getKlant() {
        return klant;
    }

    public void setKlant(Persoon klant) {
        this.klant = klant;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */

    public void voegToe(Artikel artikel) {

        artikelen.add(artikel);

        // method body omitted
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {
        // method body omitted
        int aantal = artikelen.size();
        System.out.println("Aantal artikelen: " + aantal);
        return aantal;
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs(Artikel artikel) {
        // method body omitted


        for(Artikel a : artikelen) {
            System.out.println(a.getPrijs());
            totaal += a.getPrijs();
        }
        System.out.println("Totaal is: " + totaal);

       return totaal;
    }

}

