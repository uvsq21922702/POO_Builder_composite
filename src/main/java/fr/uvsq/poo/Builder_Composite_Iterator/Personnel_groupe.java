package fr.uvsq.poo.Builder_Composite_Iterator;

import java.util.ArrayList;
import java.util.List;

public class Personnel_groupe implements PersonnelInterface {
    private final List<PersonnelInterface> personnelInterace;

    public Personnel_groupe() {
        personnelInterace = new ArrayList<PersonnelInterface>();
    }

    public void addPersonnel(PersonnelInterface p) {
        personnelInterace.add(p);
    }

    public void removePersonnel(PersonnelInterface p) {
        personnelInterace.remove(p);
    }

    public List<PersonnelInterface> getAllPersonnel() {
        return personnelInterace;
        
    }

    @Override
    public void Afficher() {
        System.out.print("Ceci est un groupe de personne");
    }
}
