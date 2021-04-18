package fr.uvsq.poo.Solid.Dip;

import java.time.LocalDateTime;

public class ClasseMetier {

    public void uneMethodeMetier(LoggerInterface log) {
        log.write(LocalDateTime.now() + "time de debut de la methode métier");
        log.write(LocalDateTime.now() + "time de fin de la  methode métier");
    }

}
