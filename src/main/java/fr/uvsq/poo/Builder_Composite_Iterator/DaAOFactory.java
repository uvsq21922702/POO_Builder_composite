package fr.uvsq.poo.Builder_Composite_Iterator;

public class DaAOFactory {
    public static InterfaceDAO<Personnel> getPersonneldao(){
        return new PersonnelDAOSerialiser();
    }

    public static InterfaceDAO<Personnel_groupe> getPersonnelgrpdao(){
        return new GrpPersonnelDAOSerialiser();
    }
}
