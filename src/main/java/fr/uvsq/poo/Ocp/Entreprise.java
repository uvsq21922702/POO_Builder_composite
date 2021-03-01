package fr.uvsq.poo.Ocp;

public class Entreprise {
private List<Employe> salarieList;
private List<Vendeur> vendeurList;
	
	public Entreprise() {
		salarieList = new ArrayList<Employe>();
		vendeurList = new ArrayList<Employe>();

	}
	
	
	public double getSommeTotaleSalaires() {
		double sum = 0;
		for (Employe e : salarieList) {
			sum += e.calculSalaire();
		}
		for (Vendeur v : salarieList) {
			sum += v.calculSalaire();
		}
		
		return sum;
	
}
