package models;

public class Square {

	private Piece piece;

	private Coordinate coordinate;

	public Square(int x, int y) {
	  coordinate.setRow(x);
	  coordinate.setColumn(y);
	}

	public void putPiece(Piece piece){
		this.piece = piece;
	}
	
	public Piece getPiece(){
		return this.piece;
	}

	public Coordinate getCoordenate(){
		return this.coordinate;
	}
	public void clearPiece(){
	    this.piece = null;
	}
}