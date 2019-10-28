package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Board {

	private Map<Color, Set<Square>> squares;

	public Board() {
		squares = new HashMap<>();
		for (int i = 0; i < Color.values().length-1; i++) {
			squares.put(Color.values()[i], new HashSet<>());
		}
	}

}