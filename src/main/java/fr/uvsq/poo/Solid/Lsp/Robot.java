package fr.uvsq.poo.Solid.Lsp;

public class Robot {

	private Position position;
	private Direction direction;

Robot(Position positionn,String directionn)
    {
        position= new Position(positionn.getX(),positionn.getY());
        direction= new Direction(directionn);
    }

    public Position getPOS(){return this.position;}
    public Direction getDIR(){return this.direction;}
	
}
