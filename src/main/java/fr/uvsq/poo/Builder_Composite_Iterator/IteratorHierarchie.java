package fr.uvsq.poo.Builder_Composite_Iterator;

import java.util.Collection;
import java.util.Stack;

public class IteratorHierarchie extends  Iterator_structure{
    public IteratorHierarchie(Personnel_groupe personnelGroupe, Collection<PersonnelInterface> collection) {
        super(personnelGroupe, collection);
    }

    @Override
    protected PersonnelInterface getCollection() {
        return ((Stack<PersonnelInterface>) collection).pop();
    }
}
