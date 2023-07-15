package com.mehedi.onlineedusystem.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments extends BaseModel {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
    private String comment;
    @OneToOne(cascade = CascadeType.ALL)
    private Reacts react;
}
