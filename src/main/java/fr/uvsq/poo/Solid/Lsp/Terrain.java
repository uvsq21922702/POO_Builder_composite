package fr.uvsq.poo.Solid.Lsp

import java.util.ArrayList;
import java.util.List;

public class Terrain {
    private ArrayList<Robot> robotList;
    private List<RobotMobile> mobileList;

    public Terrain() {
        robotList = new ArrayList<Robot>();
        mobileList = new ArrayList<RobotMobile>();
    }

    public void avancerTous() {
        for (RobotMobile robotMobile : mobileList) {
            robotMobile.avance();
        }
    }

    public List<Robot> getRobotList() {
        return robotList;
    }

    public List<RobotMobile> getMobileList() {
        return mobileList;
    }

}
