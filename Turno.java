package models;

public class Turno {

        private int value;
    
        public Turno() {
            value = 0;
        }
    
        public Color take() {
            return Color.values()[value];
        }
    
        public void change() {
            value = (value + 1) % (Color.values().length);
        }

}