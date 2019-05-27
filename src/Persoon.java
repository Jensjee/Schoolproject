import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persoon {

    public Persoon() {
        geboortedatum = "25/13/1500";
        geslacht = 'b';

    }
    public Persoon(int bsn, String voornaam, String achternaam, String geboortedatum, char geslacht) {
        this.bsn = bsn;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
    }

    private int bsn;
    private String voornaam;
    private String achternaam;
    public String geboortedatum;
    private char geslacht;
    private String soort = "";

    public int getBsn() {
        return bsn;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public String getGeslacht() {
        if(geslacht == 'm') {
            soort = "man";
        }
        else if(geslacht == 'v') {
            soort = "vrouw";
        }
        else {
            soort = "onbekend";
        }
        return soort;
    }

    public void setBsn(int bsn){
        if(bsn >= 111111111 && bsn <= 999999999){
            this.bsn = bsn;
        }
        else {
            System.out.println("bsn moet 9 cijfers bevatten");
        }
    }

    public void setVoornaam(String voornaam){
        if(voornaam.matches("[A-Z][a-z]*")) {
            this.voornaam = voornaam;
        }
        else {
            System.out.println("moet letters bevatten");
        }

    }

    public void setAchternaam(String achternaam){
        if(achternaam.matches("[A-Z][a-z]*")) {
            this.achternaam = achternaam;
        }
        else {
            System.out.println("moet letters bevatten");
        }
    }

    public boolean valDob(String geboortedatum){
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date datum = null;
        date.setLenient(false);

        try {
            datum = date.parse(geboortedatum);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public void setGeboortedatum(String geboortedatum){

        if(valDob(geboortedatum)) {
            this.geboortedatum = geboortedatum;
        }
        else {
            System.out.println("Verkeerde format");
        }
    }
    public void setGeslacht(char geslacht) {
        if(checkGeslacht()) {
            this.geslacht = geslacht;
        }

    }
    public boolean checkGeslacht() {
            if(geslacht == 'm' || geslacht == 'v') {
                return true;
            }
            else {
                System.out.println("Geslacht moet een m of een v zijn.");
                return false;
            }
    }
    public String toString() {
        return "bsn: " + bsn + " voornaam: " + voornaam + " achternaam: " + achternaam + " geboortedatum: " + geboortedatum + " geslacht: " + geslacht;
    }

    }


