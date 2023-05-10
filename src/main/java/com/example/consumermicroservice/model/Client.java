package com.example.consumermicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String firstname;
    private String lastname;
    private String idNumber;
    private Date dateOfBirth;
    private String address;
    @OneToMany(mappedBy = "client")
    private List<Event> events;

}

