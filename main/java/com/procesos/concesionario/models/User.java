package com.procesos.concesionario.models;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class User {

    @Id
    private Long _id;
    @Column(name = "first_name")
    private String _firstName;
    @Column(name = "last_name")
    private String _lastName;
    private String _email;
    private String _password;
    private String _address;
    private LocalDate _birthday;
}
