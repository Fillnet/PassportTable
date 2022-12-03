package Passport;

import Passport.Passport;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    public Set<Passport> passports = new HashSet<>();

    public void addPassport(Passport passport) {
        this.passports.add(passport);
        }

    public Passport findNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getSerialNumber() == number) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "passports=" + passports +
                '}';
    }
}
