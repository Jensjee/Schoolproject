import java.util.ArrayList;
import java.util.LinkedList;

public class KassaRij {
    private ArrayList<Dienblad> dienblad = new ArrayList<Dienblad>();
    private LinkedList<Persoon> list = new LinkedList<Persoon>();
    /**
     * Constructor
     */
    public KassaRij() {
        // method body omitted
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        // method body omitted
        dienblad.add(klant);

        list.add(klant.getKlant());
        System.out.println(list);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        // method body omitted
        return null;
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        // method body omitted
        return false;
    }
}