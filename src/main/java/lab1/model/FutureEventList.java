package lab1.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lab1.utils.FelOrderingCriteria;

public class FutureEventList {
    private List<Event> fel;
    private Comparator<Event> comparator;

    public FutureEventList() {
        this.fel = new ArrayList<>();
        this.comparator = new FelOrderingCriteria();
    }

    public Event imminent() {
        return this.fel.remove(0);
    }

    public void insert(Event event) {
        this.fel.add(event);
        this.fel.sort(this.comparator);
    }

    @Override
    public String toString() {
        String ret = "[";

        for (int i = 0; i < this.fel.size() - 1; i++) {
            ret += this.fel.get(i).toString() + ",";
        }

        return ret += this.fel.get(this.fel.size() - 1).toString() + "]";
    }
}
