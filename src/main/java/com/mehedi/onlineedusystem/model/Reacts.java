package com.mehedi.onlineedusystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int react;
}
