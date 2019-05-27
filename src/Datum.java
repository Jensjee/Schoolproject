import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	public Datum() {
		dag = 0;
		maand = 0;
		jaar = 0;
	}
	public Datum(int dag, int maand, int jaar){

		if(bestaatDatum(dag, maand, jaar)){
			this.dag = dag;
			this.maand = maand;
			this.jaar = jaar;
		}
		else {
			this.dag = 0;
			this.maand = 0;
			this.jaar = 0;
		}
	}
	  /**
	   * Constructor
	   */

	public int getDag() {
		  return dag;
	}

	public void setDag(int dag){
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand){
		this.maand = maand;
	}
	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar){
		this.jaar = jaar;
	}



	public boolean bestaatDatum(int dag, int maand, int jaar){
		boolean schikkeljaar = false;
		if(dag >= 1 && dag <= 31 && maand >= 1 && maand <= 12 && jaar >= 1900 && jaar <= 2100){

			if(maand == 1 || maand == 3 || maand == 5 || maand == 7 || maand == 8 || maand == 10 || maand == 12){
				System.out.println("true");
				return true;
			}
			else if(maand != 2 && dag <= 30) {
				System.out.println("true2");
				return true;
			}

			if((maand == 2) && (jaar%4==0) && (!(jaar%100==0)) || (jaar%400==0)) {
				if(dag <= 29) {
					System.out.println("is een schikkeljaar");
					schikkeljaar = true;
					return true;
				}

			}
			if(maand == 2 & !schikkeljaar && dag > 28) {
				System.out.println("is een schikkeljaar, dag mag niet 29 of hoger zijn.");
				return false;
			}
			else {
				System.out.println("geen schikkeljaar, mag wel want dag is onder de 29");
				return true;
			}




		}
		else {
			System.out.println("bestaat niet");
		}
		return false;

	}

}
