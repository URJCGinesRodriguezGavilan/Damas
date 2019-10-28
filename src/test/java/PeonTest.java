package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PeonTest{
    @Test
    public void ColorPeonTest(){
        Peon peon = new Peon(Color.WHITE);
        Color resultColor = peon.getColor();
        assertEquals(Color.WHITE, resultColor);
    }
    @Test
    public void oneMoveWhitePeon(){
        Peon expectedPeon = new Peon(Color.WHITE);
        Square squareOrigin = new Square(8,3);
        squareOrigin.putPiece(expectedPeon);
        Square squareDestination = new Square(7,2);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertNotNull(squareDestination.getPiece());
    }
    @Test
    public void oneErrorMovePeon(){
        Peon expectedPeon = new Peon(Color.WHITE);
        Square squareOrigin = new Square(8,3);
        squareOrigin.putPiece(expectedPeon);
        Square squareDestination = new Square(5,1);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertNull(squareDestination.getPiece());
    }
    
    @Test
    public void oneMoveBlackPeon(){
        Peon peon = new Peon(Color.BLACK);
        Square squareOrigin = new Square(1,2);
        squareOrigin.putPiece(peon);
        Square squareDestination = new Square(2,1);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertEquals(squareDestination.getPiece(),peon);
    }

    @Test
    public void WhitePeonToDamaTest(){
        Peon peon = new Peon(Color.WHITE);
        Dama expectedPiece = new Dama(Color.WHITE);
        Square squareOrigin = new Square(2,3);
        squareOrigin.putPiece(peon);
        Square squareDestination = new Square(1,2);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertEquals (squareDestination.getPiece(),expectedPiece);
    }
    
    @Test
    public void PeonToOcupedSquareTest(){
        Peon peon = new Peon(Color.BLACK);
        Dama peonTwo = new Dama(Color.BLACK);
        Square squareOrigin = new Square(7,2);
        squareOrigin.putPiece(peon);
        Square squareOcuped = new Square(8,3);
        squareOcuped.putPiece(peonTwo);
        squareOrigin.getPiece().move(squareOcuped);
        assertEquals (squareOrigin.getPiece(),peon);
        assertEquals (squareOcuped.getPiece(),peonTwo);
        
    }

    @Test
    public void BlackPeonToDamaTest(){
        Peon peon = new Peon(Color.BLACK);
        Dama expectedPiece = new Dama(Color.BLACK);
        Square squareOrigin = new Square(7,2);
        squareOrigin.putPiece(peon);
        Square squareDestination = new Square(8,3);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertEquals (squareDestination.getPiece(),expectedPiece);
    }

    @Test
    public void peonEatOnePeonTest(){
        Peon peon = new Peon(Color.WHITE);
        Dama eatedPiece = new Dama(Color.BLACK);
        Square squareOrigin = new Square(1,2);
        squareOrigin.putPiece(peon);
        Square squareEatedPiece = new Square(2,3);
        squareEatedPiece.putPiece(eatedPiece);
        Square squareDestination = new Square(3,4);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareEatedPiece.getPiece());
        assertEquals (squareDestination.getPiece(),peon);
    }

    @Test
    public void peonEatTwoPeonTest(){
        Peon peon = new Peon(Color.WHITE);
        Peon eatedPiece1 = new Peon(Color.BLACK);
        Peon eatedPiece2 = new Peon(Color.BLACK);
        Square squareOrigin = new Square(1,2);
        squareOrigin.putPiece(peon);
        Square squareEatedPiece1 = new Square(2,3);
        squareEatedPiece1.putPiece(eatedPiece1);
        Square squareEatedPiece2 = new Square(4,5);
        squareEatedPiece2.putPiece(eatedPiece2);
        Square squareDestination = new Square(5,6);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareEatedPiece1.getPiece());
        assertNull(squareEatedPiece2.getPiece());
        assertEquals (squareDestination.getPiece(),peon);
    }
}
