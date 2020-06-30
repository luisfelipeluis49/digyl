package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SONG")
@Data
public class Song {

    @Id
    @Column(name = "ID_SONG")
    private int idSong;

    @Column(name = "SONG_NAME")
    private String songName;

    @Column(name = "TRACK_POSITION")
    private int trackPosition;
}
