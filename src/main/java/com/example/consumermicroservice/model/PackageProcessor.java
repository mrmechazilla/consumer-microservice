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
public class PackageProcessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long processorId;
    private String fullname;
    private String description;
    @OneToMany(mappedBy = "packageprocessor")
    private List<PackageBox> packageBoxes;
}
