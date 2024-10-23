package be.abis.helloworldmab.service;

import be.abis.helloworldmab.model.Person;
import org.springframework.stereotype.Component;

@Component
public class AbisPersonService implements PersonService {
    public Person findPersonById(int id){
        return new Person("John",30);
    }
    public void sayHelloTo(Person person){
        System.out.println("Welcome to Spring, " + person.getFirstName());
    }

}
