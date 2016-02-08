package com.crud.restapi.exposed;


import java.util.Date;

public class UserExposed {

    private String id;

    private String email;

    private String forename;

    private String surname;

    private Date created;


    public UserExposed(String id, String email, String forename, String surname, Date created) {

        this.id = id;
        this.email = email;
        this.forename = forename;
        this.surname = surname;
        this.created = created;
    }
}
