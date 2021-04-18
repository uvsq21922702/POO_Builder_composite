package fr.uvsq.poo.Builder_Composite_Iterator;

public interface InterfaceDAO <T>{

    T create(T objet);
    T read(String id);
    T update(T objet);
    void delete(T objet);


}
