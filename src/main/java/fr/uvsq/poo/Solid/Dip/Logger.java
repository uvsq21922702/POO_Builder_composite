package fr.uvsq.poo.Solid.Dip;

public class Logger implements LoggerInterface {

    @Override
    public void write(String string){
        System.out.println(string);
    }
}
