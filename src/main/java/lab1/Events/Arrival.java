package lab1.Events;

import java.util.List;

import lab1.model.Entity;
import lab1.model.Event;
import lab1.model.FutureEventList;
import lab1.model.Server;
import lab1.utils.Ordering;

public class Arrival extends Event {

    public Arrival(double clock, Entity entity) {
        super(clock, Ordering.ARRIVAL, entity);
    }
    @Override
    public void planificate(FutureEventList fel, List<Server> servers) {

        Server s = servers.get(0);

        if (s.isBusy()) {
            s.getQueue().enqueue(this.getEntity());
        } else {
            s.setEntity(this.getEntity());
            fel.insert(new EndOfService(this.getClock() + this.EndOfServiceBehavior.getServiceDuration(),
                    this.getEntity()));
        }

        fel.insert(new Arrival(this.getClock() + ArrivalBehavior.getServiceDuration(),
                new Entity(this.getEntity().getId() + 1)));

    }

}
