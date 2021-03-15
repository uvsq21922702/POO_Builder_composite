package fr.uvsq.poo.Solid.Ocp;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
private List<Employee> salarieList;
private List<Vendeur> vendeurList;
	
	public Entreprise() {
		salarieList = new ArrayList<Employee>();
		vendeurList = new ArrayList<Vendeur>();

	}
	
	
	public double getSommeTotaleSalaires() {
		double sum = 0;
		for (Employee e : salarieList) {
			sum += e.calculSalaire();
		}
		for (Vendeur v : vendeurList) {
			sum += v.calculSalaire();
		}
		
		return sum;
	
}}
