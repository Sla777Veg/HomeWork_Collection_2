import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SponsorList {

    private final Set<Sponsor> sponsors = new HashSet<>();

    public void addSponsor(Sponsor sponsor) {
        this.sponsors.add(sponsor);
    }

    public void removeSponsor(String fullName) {
        Iterator<Sponsor> sponsorsIterator = this.sponsors.iterator();
        while (sponsorsIterator.hasNext()) {
            if (sponsorsIterator.next().getFullName().equals(fullName)) {
                sponsorsIterator.remove();
                break;
            }
        }
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список спонсоров: ").append('\n');
        for (Sponsor sponsor : this.sponsors) {
            sb.append(sponsor).append('\n');
        }
        return sb.toString();
    }
}
