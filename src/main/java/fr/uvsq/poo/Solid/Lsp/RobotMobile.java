package fr.uvsq.poo.Solid.Lsp;
public class RobotMobile extends RobotStatique {

    public void setPOS(int x, int y){this.getPOS().setX(x); this.getPOS().setY(y);}
    public void setDIR(String direction){this.getDIR().setDirection(direction);}

    public RobotMobile(Position position1, String direction1) {
        super(position1, direction1);
    }

    public void avance() {
        if (this.getDIR().getDirection() == "LEFT") {
            this.getPOS().setX(this.getPOS().getX() - 1);
        } else if (this.getDIR().getDirection() == "RIGHT") {
            this.getPOS().setX(this.getPOS().getX() + 1);
        } else if (this.getDIR().getDirection() == "BACKWARD"){
            this.getPOS().setY(this.getPOS().getY() - 1);
        } else this.getPOS().setY(this.getPOS().getY() + 1);}

  }
