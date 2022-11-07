import java.util.Objects;

public class Mechanic <T extends Transport> {

    private final String fullName;
    private String company;
    private String typeCar;

    public boolean carryOutMaintenance(T t) {
        return t.carryOutMaintenance();
    }

    public void repairCar(T t) {
        t.repairCar();
    }


    public Mechanic(String fullName, String company, String typeCar) {

        this.fullName = Objects.requireNonNullElse(fullName, "default");
        this.company = Objects.requireNonNullElse(company, "default");
        this.typeCar = Objects.requireNonNullElse(typeCar, "default");
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                ", typeCar='" + typeCar + '\'' +
                '}';
    }
}
