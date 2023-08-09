import java.util.List;

public class PersonUtils {


//    List<Person> personList;

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    class AgeFinder25 implements CheckPerson{  //  Local Class.   can I give this parameters?
        @Override
        public boolean test(Person p) {
            return p.getAge() > 25;
        }
    }

    CheckPerson c1 = new CheckPerson() {
        @Override
        public boolean test(Person p) {
            if (p.getAge()> 30){
                return true;
            }
            return false;
        }
    };

    CheckPerson c2 = p -> p.getAge()> 40;
}
