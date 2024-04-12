package lab1.model;

public abstract class Server {

    private Entity entity;

    public boolean isBusy() {
        return this.entity != null;
    }
}
