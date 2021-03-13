package fr.uvsq.poo.Srp_Ocp

import org.junit.Before;
import org.junit.Test;


public class srp_ocp_test {
    Vendeur v1,v2;
    Employe e1,e2;
    Manager manager;

    coordonnees c,c2,v1,v2,m;

    Entreprise entreprise;


    @Before
    public void setup() {
        vendone = new Vendeur();
        v1=new coordonnees("Yacine","Versailles");

        vendtwo = new Vendeur();
        v2= new coordonnees("Nasssim","Creteil");

        empone = new Employe();
        c1=new coordonnees("FARID","PARIS");

        emptwo= new Employe();
        c2= new coordonnees("babou","95");

        entreprise= new Entreprise();
        manager = new Manager();
        m=new coordonnees("Yacine","La Verriere");
    }

    @Test
    public void test() {

        v1.setEXP(2);
        v2.setEXP(3);
        e1.setEXP(1);
        e2.setEXP(0);
        manager.setEXP(5);

        entreprise.getSalarieList().add(v1);
        entreprise.getSalarieList().add(v2);
        entreprise.getSalarieList().add(e1);
        entreprise.getSalarieList().add(e2);
        entreprise.getSalarieList().add(manager);

        System.out.println("le solde est de : " + entreprise.getSommeTotaleSalaires());

    }
}
