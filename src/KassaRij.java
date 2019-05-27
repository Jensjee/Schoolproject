import java.util.ArrayList;
import java.util.LinkedList;

public class KassaRij {

    private LinkedList<Dienblad> list = new LinkedList<Dienblad>();
    /**
     * Constructor
     */
    public KassaRij() {

    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        this.list.add(klant);
        System.out.println("lijst" + list.size());
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
        if(erIsEenRij()) {
            return this.list.removeFirst();
        }
        return null;
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        return this.list.size() > 0;
    }
}