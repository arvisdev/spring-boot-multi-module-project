/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arvisdev.smmlib.repositories;

import com.arvisdev.smmlib.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author arvisdev
 */
public interface PersonRepository extends CrudRepository<Person, Long>
{
    
}
