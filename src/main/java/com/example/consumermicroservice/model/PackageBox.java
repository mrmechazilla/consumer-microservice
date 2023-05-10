package com.example.consumermicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PackageBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boxId;
    private int boxCode;
    private int boxQuantity;
    private String boxDescription;
    @OneToMany(mappedBy = "packagebox")
    private List<Package> packages;
    //@ManyToOne
    //@JoinColumn(name = "PROCESSOR_ID", referencedColumnName = "processorId")
    //private PackageProcessor packageprocessor;
}
