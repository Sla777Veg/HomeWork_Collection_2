import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MechanicList {

    private final Set<Mechanic> mechanics = new HashSet<>();

    public void addMechanic(Mechanic mechanic) {
        this.mechanics.add(mechanic);
    }

    public void removeSponsor(String fullName) {
        Iterator<Mechanic> mechanicsIterator = this.mechanics.iterator();
        while (mechanicsIterator.hasNext()) {
            if (mechanicsIterator.next().getFullName().equals(fullName)) {
                mechanicsIterator.remove();
                break;
            }
        }
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список механиков :").append('\n');
        for (Mechanic mechanic : this.mechanics) {
            sb.append(mechanic).append('\n');
        }
        return sb.toString();
    }
}
