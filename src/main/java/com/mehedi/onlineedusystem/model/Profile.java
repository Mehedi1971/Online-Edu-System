package com.mehedi.onlineedusystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String student_Id;
    private String email;
    private String description;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Posts> posts;
}
