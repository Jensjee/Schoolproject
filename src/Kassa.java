import java.util.Iterator;

public class Kassa {
    private int aantalArtikelen = 0;
    private double totaalPrijs = 0.0;
    private int artikelenGepasseerd = 0;
    private double aantalGeld;
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        resetKassa();
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        Iterator<Artikel> artikelen = klant.iterator();

        while (artikelen.hasNext()) {
            Artikel artikel = artikelen.next();
            aantalArtikelen++;
            totaalPrijs += artikel.getPrijs();
        }
        artikelenGepasseerd += aantalArtikelen;
        aantalGeld += totaalPrijs;

    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        System.out.println(artikelenGepasseerd);
        return this.artikelenGepasseerd;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass
     * zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        System.out.println(aantalGeld);
        return this.aantalGeld;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        this.artikelenGepasseerd = 0;
        this.aantalGeld = 0;
    }
}