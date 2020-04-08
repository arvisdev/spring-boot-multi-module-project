/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arvisdev.smm.controllers;

import com.arvisdev.smmlib.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arvisdev
 */
@Controller
public class PersonController
{

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    @RequestMapping("/contacts")
    public String getContacts(Model model)
    {
        System.out.println("In getContacts");
        model.addAttribute("contacts", personRepository.findAll());

        return "contacts/list";
    }
}
