package com.crud.restapi;

import java.util.Date;

public class User {

    private String id;

    private String email;

    private String forename;

    private String surname;

    private Date created;


    public User(String id, String email, String forename, String surname, Date created) {

        this.id = id;
        this.email = email;
        this.forename = forename;
        this.surname = surname;
        this.created = created;
    }
}
