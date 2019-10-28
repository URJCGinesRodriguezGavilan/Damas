package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SquareTest{

    @Test
    public void squareTest(){
        Square OUTSquare = new Square(0,0);
        assertNull(OUTSquare.getPiece());
    } 

    
    @Test
    public void SquareOcuppedTest() {
        Square OUTSquare = new Square(0,0);
        Piece expectedPiece = new Peon(Color.BLACK);
        Piece actualPiece = OUTSquare.getPiece();
        assertEquals(expectedPiece, actualPiece);
    }

    @Test
    public void SquareEmptyTest() {
        Square OUTSquare = new Square(0,0);
        Piece resultPiece = OUTSquare.getPiece();
		assertNull(resultPiece);
    }
    
    @Test
    public void SquareClearTest() {
        Square OUTSquare = new Square(0,0);
        Piece expectedPiece = new Peon(Color.BLACK);
        OUTSquare.putPiece(expectedPiece);
        Piece resultPiece = OUTSquare.getPiece();
        assertEquals(expectedPiece, resultPiece);
        OUTSquare.clearPiece();
        assertNull(OUTSquare.getPiece());
    }
}