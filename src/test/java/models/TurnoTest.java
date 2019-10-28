package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TurnoTest{

    private Turno OUTTurno;

    public TurnoTest(){
        OUTTurno = new Turno();
    }
	@Test
	public void testTurn() {
		Color resultColor = OUTTurno.take();
		Color expectedColor = Color.WHITE;
		assertEquals(expectedColor, resultColor);
	}

	@Test
	public void testOneChange() {
		OUTTurno.change();
		Color resultColor = OUTTurno.take();
		Color expectedColor = Color.BLACK;
		assertEquals(expectedColor, resultColor);
	}

	@Test
	public void testTwoChange() {
		OUTTurno.change();
		OUTTurno.change();
		Color resultColor = OUTTurno.take();
		Color expectedColor = Color.WHITE;
		assertEquals(expectedColor, resultColor);
	}

	@Test
	public void testThreeChange() {
		OUTTurno.change();
		OUTTurno.change();
		OUTTurno.change();
		Color resultColor = OUTTurno.take();
		Color expectedColor = Color.BLACK;
		assertEquals(expectedColor, resultColor);
	}
}