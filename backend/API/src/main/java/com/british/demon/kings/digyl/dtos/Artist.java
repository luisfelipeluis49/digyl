package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ARTIST")
@Data
public class Artist {

    @Id
    @Column(name = "ID_ARTIST")
    private int idArtist;

    @Column(name = "ARTIST_NAME")
    private String artistName;
}
