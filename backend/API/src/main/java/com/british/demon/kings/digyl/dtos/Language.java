package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_LANGUAGE")
@Data
public class Language {

    @Id
    @Column(name = "ID_LANGUAGE")
    private int idLanguage;

    @Column(name = "LANGUAGE_NAME")
    private String languageName;
}
