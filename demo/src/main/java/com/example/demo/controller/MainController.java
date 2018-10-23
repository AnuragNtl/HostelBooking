package com.example.demo.controller;
import com.example.demo.entities.*;
@RestController
public class MainController {
    public MainController(){}
    @RequestMapping(value="/,
    method="POST")
    public String index()
    {
        
    }
    @RequestMapping(value="/getUser/{userId}",method=RequestMethod.GET)
    public User getUser(long id)
    {
        
    }

}
