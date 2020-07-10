package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GENDER")
@Data
public class Gender {

    @Id
    @Column(name = "ID_GENDER")
    private int idGender;

    @Column(name = "GENDER_NAME")
    private String genderName;
}
