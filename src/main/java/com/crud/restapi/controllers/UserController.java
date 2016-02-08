package com.crud.restapi.controllers;

import com.crud.restapi.exposed.UserExposed;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

@Controller
public class UserController {


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserExposed getUser(){
        Calendar currentDate = Calendar.getInstance(); //Get the current date
        return new UserExposed("10", "youcef@gmail.com", "Yo ", "Ya", currentDate.getTime());
    }

}
