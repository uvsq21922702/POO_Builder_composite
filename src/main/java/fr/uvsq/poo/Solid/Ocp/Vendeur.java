package fr.uvsq.poo.Solid.Ocp;

public class Vendeur extends Employee {
	private double commission;
	public double calculSalaire() {
		return super.calculSalaire()+commission;
	}

}
