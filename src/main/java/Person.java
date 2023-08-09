
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {


    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person() {
        this("name", null, null, null);
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress= emailAddress;

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {

        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today).getYears();
    }
    public void printPerson() {
        System.out.println("Name: " +this.getName()+", Age: "+this.getAge());
    }
}
