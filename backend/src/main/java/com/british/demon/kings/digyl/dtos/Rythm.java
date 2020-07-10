package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_RYTHM")
@Data
public class Rythm {

    @Id
    @Column(name = "ID_RYTHM")
    private int idRythm;

    @Column(name = "RYTHM_TYPE")
    private String rythmType;
}
