import java.util.List;

public class Main{

    List<Person> personList;


    public boolean test(Person p) {
        return false;
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }


}
