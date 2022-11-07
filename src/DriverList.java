import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DriverList {

    private final Set<Driver> drivers = new HashSet<>();

    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }

    public void removeDriver(String fullName) {
        Iterator<Driver> mechanicsIterator = this.drivers.iterator();
        while (mechanicsIterator.hasNext()) {
            if (mechanicsIterator.next().getFullName().equals(fullName)) {
                mechanicsIterator.remove();
                break;
            }
        }
    }

    public Set<Driver> getMechanics() {
        return drivers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список водителей:").append('\n');
        for (Driver driver : this.drivers) {
            sb.append(driver).append('\n');
        }
        return sb.toString();
    }
}
