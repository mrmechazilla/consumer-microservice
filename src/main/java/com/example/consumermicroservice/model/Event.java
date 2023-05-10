package com.example.consumermicroservice.model;

import jdk.jfr.Name;
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
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private Date eventDate;
    private boolean extracted;
    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "clientId")
    private Client client;

    @OneToMany(mappedBy = "event")
    private List<Package> packages;
}
