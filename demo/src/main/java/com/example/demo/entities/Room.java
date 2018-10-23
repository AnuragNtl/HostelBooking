package com.example.demo.entities;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
public class Room {
    @OneToMany(cascade=CascadeType.ALL)
    private Set<User> users;
    public Room()
    {
        
    }
    public void addUser(User user)
    {
        users.add(user);
    }

}
