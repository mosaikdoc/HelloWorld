package be.abis.helloworldmab.service;

import be.abis.helloworldmab.model.Person;

public interface PersonService {
    Person findPersonById(int id);
    void sayHelloTo(Person person);
}
