import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {
        transports.offer(transport);
    }

    public void addCar(Car car) {
        add(car);
    }

    public void addCargoCar(CargoCar cargoCar) {
        add(cargoCar);
    }

    public void service() {
        if (!transports.isEmpty()) {
            Transport transport = transports.poll();
            boolean result = transport.carryOutMaintenance();
            if (!result) {
                transport.repairCar();
            }
        }
    }


}
