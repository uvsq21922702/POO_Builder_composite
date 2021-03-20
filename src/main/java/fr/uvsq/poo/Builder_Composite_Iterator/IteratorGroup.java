package fr.uvsq.poo.Builder_Composite_Iterator;

import java.util.Collection;

public class IteratorGroup extends Iterator_structure{
    public IteratorGroup(Personnel_groupe personnelGroupe, Collection<PersonnelInterface> collection) {
        super(personnelGroupe, collection);
    }

    @Override
    protected PersonnelInterface getCollection() {
        return null;
    }
}
