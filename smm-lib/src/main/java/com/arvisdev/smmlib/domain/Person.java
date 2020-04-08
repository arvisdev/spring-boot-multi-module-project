/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arvisdev.smmlib.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author arvisdev
 */
@Entity
public class Person implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String cityState;

    public Person()
    {
    }

    public Person(String firstName, String lastName, String address, String cityState)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cityState = cityState;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCityState()
    {
        return cityState;
    }

    public void setCityState(String cityState)
    {
        this.cityState = cityState;
    }

    @Override
    public int hashCode()
    {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null)
        {
            return false;
        }
        if (getClass() != o.getClass())
        {
            return false;
        }
        final Person person = (Person) o;
        
        return id != null ? id.equals(person.id) : person.id == null;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(", firstName =").append(firstName);
        sb.append(", lastName =").append(lastName);
        sb.append(", address =").append(address);
        sb.append(", cityState =").append(cityState);
        sb.append('}');
        return sb.toString();
    }
    
    
}
