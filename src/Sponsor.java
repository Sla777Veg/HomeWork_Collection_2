import java.util.Objects;

public class Sponsor {
    private final String fullName;
    private int supportAmount;



    public void sponsorRace() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n "+ fullName, supportAmount);
    }

    public Sponsor(String fullName, int supportAmount) {
        this.fullName = Objects.requireNonNullElse(fullName, "default");

        if (supportAmount == 0) {
            this.supportAmount = 10_000_000;
        } else {
            this.supportAmount = supportAmount;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = supportAmount;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "fullName='" + fullName + '\'' +
                ", supportAmount=" + supportAmount +
                '}';
    }
}
