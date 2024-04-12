package lab1.model;

import java.util.List;

public abstract class Event {

    private double clock;
    private int ordering;
    private Entity entity;

    public Event(double clock, int ordering, Entity entity) {
        this.clock = clock;
        this.ordering = ordering;
        this.entity = entity;
    }

    public double getClock() {
        return this.clock;
    }

    public int getOrdering() {
        return this.ordering;
    }

    public Entity getEntity() {
        return this.entity;
    }

    @Override
    public String toString() {

        return "(" + this.clock + "," + this.entity.toString() + "," + this.ordering + ")";
    }

    public abstract void planificate(FutureEventList fel, List<Server> servers);
}
