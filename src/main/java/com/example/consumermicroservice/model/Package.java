package com.example.consumermicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;
    private double packageWeight;
    private double packageHeight;
    private double packageWidth;
    private double packagePrice;
    @Enumerated(EnumType.STRING)
    private ShippingTierEnum shippingTier;
    private String departureAddress;
    private String arrivalAddress;
    @ManyToOne
    @JoinColumn(name = "EVENT_ID", referencedColumnName = "eventId")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "BOX_ID", referencedColumnName = "boxId")
    private PackageBox packagebox;
}

