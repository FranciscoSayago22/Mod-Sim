package lab1;

import java.util.ArrayList;
import java.util.List;

import lab1.Events.Arrival;
import lab1.model.Engine;
import lab1.model.Entity;
import lab1.model.Event;
import lab1.model.FutureEventList;
import lab1.model.Queue;
import lab1.model.Server;
import lab1.resources.Airstrip;

public class AirportLab1 implements Engine {

    private double simulationLenght;

    private FutureEventList fel;

    private List<Server> servers;

    public AirportLab1(double simulationLenght) {
        this.simulationLenght = simulationLenght;

        this.fel = new FutureEventList();
        this.servers = new ArrayList<>();

        Queue queue = new Queue();
        Server pista = new Airstrip(queue);

        this.servers.add(pista);

        this.fel.insert(new Arrival(0, new Entity(0)));
    }

    @Override
    public void run() {
        Event imminent = this.fel.imminent();

        while (imminent.getClock() < this.simulationLenght) {
            imminent.planificate(this.fel, this.servers);
        }
    }

    @Override
    public void generateReport() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateReport'");
    }

}
