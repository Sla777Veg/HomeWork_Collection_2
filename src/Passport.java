import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final int dateBirth;

    public Passport(int number, String lastName, String name, String middleName, int dateBirth) {
        if (name == null || lastName == null || dateBirth<=0) {
            throw new IllegalArgumentException("Заполните паспортные данные полностью");
        }
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.dateBirth = dateBirth;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
