
public class Vols extends Avion {

	private int numvols;
	private String date;
	private String heuredepart;
	private String heurearriver;
	private int porte ;
	

	public Vols(){
		super();
		this.numvols = 0;
		this.date = null;
		this.heuredepart = null;
		this.heurearriver = null;
		this.porte = -1;
		this.setNumAvion(0);
		
	}

	public Vols(int numAvion,int numvols, String date, String heuredepart, String heurearriver,int porte) {
		this.numvols = numvols;
		this.setNumAvion(numAvion);
		this.date = date;
		this.heuredepart = heuredepart;
		this.heurearriver = heurearriver;
		this.porte = porte;

	}

	public int getNumvols() {
		return numvols;
	}

	public void setNumvols(int numvols) {
		this.numvols = numvols;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeureDepart() {
		return heuredepart;
	}

	public void setHeureDepart(String heuredepart) {
		this.heuredepart = heuredepart;
	}

	public String getHeureArriver() {
		return heurearriver;
	}

	public void setHeureArriver(String heurearriver) {
		this.heurearriver = heurearriver;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public String toString() {
		return "  N° d'Avion=" + this.getNumAvion() 
				+ " | N° de vols="+ this.getNumvols() 
				+ " | Date=" + this.getDate()
				+ " | Heure de départ=" + this.getHeureDepart()
				+ " | Heure d'arriver=" + this.getHeureArriver() 
				+ " | Porte="+ this.getPorte();
		
	}

}