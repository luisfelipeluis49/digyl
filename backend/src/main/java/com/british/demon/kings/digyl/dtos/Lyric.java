package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_LYRIC")
@Data
public class Lyric {

    @Id
    @Column(name = "ID_LYRIC")
    private int idLyric;

    @Column(name = "LYRIC_TYPE")
    private String lyricType;
}
