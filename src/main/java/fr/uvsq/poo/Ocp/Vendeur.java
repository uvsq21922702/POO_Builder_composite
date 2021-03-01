package fr.uvsq.poo.Ocp;

public class Vendeur extends Employee {
	private double commission;
	public double calculSalaire() {
		return super.calculSalaire()+commission;
	}

}
