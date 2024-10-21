package com.example.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {

    @Id
    @UuidGenerator
    private UUID id;
    private String make;
    private String model;
    private int year;
}