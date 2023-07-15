package com.mehedi.onlineedusystem.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile extends BaseModel{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
    private String name;
//    private String student_Id;
    private String email;
    private String description;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Comments> comments;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Posts> posts;


}
