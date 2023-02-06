public class Cube {
    private int side;
    public Cube() {
        side = 1;
    }
    public Cube(int s) {
        if (s < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        side = s;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int s) {
        if (s < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }
    public int getSurfaceArea() {
        return 6 * side * side;
    }

    public int getVolume() {
        return side * side * side;
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }
}