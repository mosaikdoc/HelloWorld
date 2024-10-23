package be.abis.helloworldmab;

import be.abis.helloworldmab.model.Person;
import be.abis.helloworldmab.service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldMabApplicationTests {
    @Autowired
    //private HelloWorldMabApplication hwma;
    PersonService personService;

    //private Person person;

/*    @BeforeEach
    void init(){
        person = new Person("Toto",18);
    }*/
    @Test
    void person1IsSandy() {
        Person p = personService.findPersonById(1);
        System.out.println(p.getFirstName());
        assertEquals("Sandy",p.getFirstName());
    }

}
