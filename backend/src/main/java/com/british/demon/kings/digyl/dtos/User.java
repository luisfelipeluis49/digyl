package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "TB_USER")
@Data
public class User {

    @Id
    @Column(name = "ID_USER")
    private int idUser;

    @Column(name = "USER_NICKNAME")
    private String userNickname;

    @Column(name = "USER_BIRTHDATE")
    private Date userBirthDate;

    @Column(name = "USER_NATIONALITY")
    private String userNationality;

    @Column(name = "USER_COUNTRY")
    private String userCountry;
}
