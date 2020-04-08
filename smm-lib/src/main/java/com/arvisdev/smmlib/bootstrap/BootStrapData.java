/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arvisdev.smmlib.bootstrap;

import com.arvisdev.smmlib.domain.Person;
import com.arvisdev.smmlib.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author arvisdev
 */
@Component
public class BootStrapData implements CommandLineRunner
{
    private final PersonRepository personRepository;

    public BootStrapData(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("--- Started in Bootstrap ---");
        
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setAddress("Some Street 123");
        person1.setCityState("Houston, TX.");
        
        personRepository.save(person1);
        
        Person person2 = new Person();
        person2.setFirstName("Jane");
        person2.setLastName("Doe");
        person2.setAddress("Another Street 456");
        person2.setCityState("Boston, MA.");
        
        personRepository.save(person2);
        
        System.out.println("Number of people saved to DB: " + personRepository.count());
    }
    
    
}
