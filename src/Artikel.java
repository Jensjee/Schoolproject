public class Artikel {
    private String naam;
    private float prijs;

    public Artikel(){

    }
    public Artikel(String naam, float prijs){
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam){
        this.naam = naam;
    }

    public float getPrijs(){
        return prijs;
    }
    public void setPrijs(float prijs){
        this.prijs = prijs;
    }
    public String toString() {
        return "naam: " + naam + " prijs: " + prijs;
    }


}
