import java.util.ArrayList;

public class MaListe {
	ArrayList<Integer> maliste = new ArrayList<Integer>() ;
	
	public ArrayList<Integer> ajouterValeur(int valeur){
		this.maliste.add(valeur);
		System.out.println(maliste);
		System.out.println("La taille de ma liste: " + maliste.size());
		return maliste;
	}
	

	public static void main(String[] args) {
		MaListe maliste = new MaListe();
		maliste.ajouterValeur(5);
		maliste.ajouterValeur(4);
		maliste.ajouterValeur(3);
		
		
		
		
	}
}
