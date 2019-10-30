package gestionPlannification;

public enum NiveauDiffi {
	SANS_DIFF("Sans difficulté particulière"),
	DIFF_MIN("Difficulté mineurs"),
	DIFF_MOYEN("Difficulté moyenne"),
	DIFF("Difficile"),
	TRES_DIFF("Très difficile");
	
	private String niveau = "";
   
	//Constructeur
	private NiveauDiffi(String niveau) {
		this.niveau = niveau;
	}
   
	public String toString(){
		return niveau;
	}

}
