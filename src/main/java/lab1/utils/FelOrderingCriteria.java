package lab1.utils;

import java.util.Comparator;

import lab1.model.Event;

public class FelOrderingCriteria implements Comparator<Event> {

    @Override
    public int compare(Event e1, Event e2) {
        int ret = 0;

        if (e1.getClock() < e2.getClock())
            ret = -1;
        else if (e1.getClock() > e2.getClock())
            ret = 1;
        else if (e1.getOrdering() < e2.getOrdering())
            ret = -1;
        else if (e1.getOrdering() > e2.getOrdering())
            ret = 1;

        return ret;
    }

}
