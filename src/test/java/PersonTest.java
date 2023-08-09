import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class PersonTest {

    @Test
    public void getAge() {
        Person liz = new Person("Liz");
        liz.setBirthday(LocalDate.of(1985, 5, 9));
        int expected = 38;
        int actual = liz.getAge();
        liz.printPerson();

        Assert.assertEquals(expected, actual);
    }
}