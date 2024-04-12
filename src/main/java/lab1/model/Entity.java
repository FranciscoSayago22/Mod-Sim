package lab1.model;

public class Entity {

    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "" + this.id;
    }
}
