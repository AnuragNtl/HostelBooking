package com.example.demo.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import java.io.Serializable;
@Entity
public class User{
    @Id
    @GeneratedValue
    private long id;
    private String name,email,phone,address,contactDetails;
    public User(){}
    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Room room;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id=id;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getContactDetails()
    {
        return contactDetails;
    }
    public void setContactDetails(String contactDetails)
    {
        this.contactDetails=contactDetails;
    }

};
