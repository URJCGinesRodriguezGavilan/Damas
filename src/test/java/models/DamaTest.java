package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DamaTest{
    
    @Test
    public void ColorDamaTest(){
        Dama dama = new Dama(Color.WHITE);
        Color resultColor = dama.getColor();
        assertEquals(Color.WHITE, resultColor);
    }
    @Test
    public void oneMoveDamaTest(){
        Dama dama = new Dama(Color.WHITE);
        Square squareOrigin = new Square(8,3);
        squareOrigin.putPiece(dama);
        Square squareDestination = new Square(7,2);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertNotNull(squareDestination.getPiece());
    }
    
    @Test
    public void oneDiagonalTest(){
        Dama dama = new Dama(Color.WHITE);
        Square squareOrigin = new Square(1,2);
        squareOrigin.putPiece(dama);
        Square squareDestination = new Square(7,8);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertNotNull(squareDestination.getPiece());
        assertEquals (squareDestination.getPiece(),dama);
    }

    @Test
    public void oneErrorMoveDamaTest(){
        Dama dama = new Dama(Color.WHITE);
        Square squareOrigin = new Square(8,3);
        squareOrigin.putPiece(dama);
        Square squareDestination = new Square(5,1);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareOrigin.getPiece());
        assertNull(squareDestination.getPiece());
    }
    
    @Test
    public void damaToOcupedSquareTest(){
        Dama dama = new Dama(Color.BLACK);
        Peon peon = new Peon(Color.BLACK);
        Square squareOrigin = new Square(7,2);
        squareOrigin.putPiece(dama);
        Square squareOcuped = new Square(8,3);
        squareOcuped.putPiece(peon);
        squareOrigin.getPiece().move(squareOcuped);
        assertEquals (squareOrigin.getPiece(),dama);
        assertEquals (squareOcuped.getPiece(),peon);
        
    }

    @Test
    public void damaEatOnePeonTest(){
        Dama dama = new Dama(Color.WHITE);
        Peon eatedPiece = new Peon(Color.BLACK);
        Square squareOrigin = new Square(1,2);
        squareOrigin.putPiece(dama);
        Square squareEatedPiece = new Square(2,3);
        squareEatedPiece.putPiece(eatedPiece);
        Square squareDestination = new Square(3,4);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareEatedPiece.getPiece());
        assertEquals (squareDestination.getPiece(),dama);
    }

    @Test
    public void damaEatTwoPeonTest(){
        Dama dama = new Dama(Color.WHITE);
        Peon eatedPiece1 = new Peon(Color.BLACK);
        Peon eatedPiece2 = new Peon(Color.BLACK);
        Square squareOrigin = new Square(1,2);
        squareOrigin.putPiece(dama);
        Square squareEatedPiece1 = new Square(2,3);
        squareEatedPiece1.putPiece(eatedPiece1);
        Square squareEatedPiece2 = new Square(4,5);
        squareEatedPiece2.putPiece(eatedPiece2);
        Square squareDestination = new Square(5,6);
        squareOrigin.getPiece().move(squareDestination);
        assertNull(squareEatedPiece1.getPiece());
        assertNull(squareEatedPiece2.getPiece());
        assertEquals (squareDestination.getPiece(),dama);
    }
}
