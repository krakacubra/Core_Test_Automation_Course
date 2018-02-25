package test.java.empployeeLab.model;

import main.java.employeeLab.model.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void toStringShouldReturnNameAndSurname(){
        Person person = new Person("John", "Doe");
        assertEquals("John Doe", person.toString());
    }


}
