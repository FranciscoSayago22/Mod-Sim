package lab1.Events;

import java.util.List;

import lab1.model.Entity;
import lab1.model.Event;
import lab1.model.FutureEventList;
import lab1.model.Server;
import lab1.utils.Ordering;

public class EndOfService extends Event {

    public EndOfService(double clock, Entity entity) {
        super(clock, Ordering.END_OF_SERVICE, entity);
    }

    @Override
    public void planificate(FutureEventList fel, List<Server> servers) {
        throw new RuntimeException("not implemented yet");
    }

}
