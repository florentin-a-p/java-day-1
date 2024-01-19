package polymorphism;

public class House {
    private int window;
    private int door;

    public House(int window, int door) {
        this.window = window;
        this.door = door;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
