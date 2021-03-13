package fr.uvsq.poo.Solid.Lsp;

public class Direction {

    private String dir;

    public Direction(){this.dir=" ";}

    public Direction(String dir){ setDirection(dir);}

    public String getDirection(){return dir;}


    public void setDirection(String direction) {
        switch (direction) {
            case "LEFT":
                this.dir=direction;
                break;
            case "RIGHT":
                this.dir=direction;
                break;
            case "FORWARD":
                this.dir=direction;
                break;
            case "BACKWARD":
                this.dir=direction;
                break;
        }
    }
}
