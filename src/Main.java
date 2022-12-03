import Passport.Passport;
import Passport.PassportList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Passport inanov = new Passport(3562,"Ivanov","Ivan","Ivanovich");
        Passport petrov = new Passport(3563,"Petrov","Petr","Ivanovich");
        Passport sidorov = new Passport(3568,"Sidorov","Sidor","Petrovich");
        Passport bobkinsky = new Passport(3572,"Bobkibsky","Bobik","Sidorovich");
        Passport dobkinsky = new Passport(3782,"Dobkinsky","Dobbi","Mazaevich");
        Passport levitan = new Passport(3142,"Levitan","Isaak","Orkestrovich");
        Passport levitan1 = new Passport(3142,"FalseLevitan","Isaak","Orkestrovich");
        PassportList passportList = new PassportList();
        passportList.addPassport(inanov);
        passportList.addPassport(petrov);
        passportList.addPassport(sidorov);
        passportList.addPassport(bobkinsky);
        passportList.addPassport(dobkinsky);
//        System.out.println(passportList);
        passportList.addPassport(levitan);
//        System.out.println(passportList);
        System.out.println(passportList.findNumber(3142));
        passportList.addPassport(levitan1);
//        System.out.println(passportList);
        System.out.println(passportList.findNumber(3142));
    }

}
