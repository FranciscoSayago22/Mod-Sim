package lab1;

import lab1.model.Engine;
import lab1.utils.Ordering;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Engine e1 = new AirportLab1(40320);
        e1.run();
        e1.generateReport();
    }
}
