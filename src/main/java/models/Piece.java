package models;

public abstract class Piece {

	private Color color;

	public Piece(Color color){
		this.color = color;
	}
	public Color getColor() {
		return this.color;
	}

	public abstract void move(Square square);

}