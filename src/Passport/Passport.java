package Passport;
import Passport.PassportList;
import java.util.Objects;


public class Passport {
    private final int serialNumber;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final int birthDate;

    public Passport(int serialNumber, String lastName, String name, String middleName,int birthDate) {
        this.serialNumber = serialNumber;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.birthDate=birthDate;
    }


    public int getSerialNumber() {
        return serialNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Passport passport = (Passport) o;
        return serialNumber==passport.serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "serialNumber=" + serialNumber +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName +
                ", birth date='"+birthDate+'\n'+
                '}';
    }
}