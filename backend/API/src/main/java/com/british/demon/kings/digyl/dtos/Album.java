package com.british.demon.kings.digyl.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "TB_ALBUM")
@Data
public class Album {

    @Id
    @Column(name = "ID_ALBUM")
    private int idAlbum;

    @Column(name = "ALBUM_TITLE")
    private String albumTitle;

    @Column(name = "ALBUM_TRACKS")
    private int albumTracks;

    @Column(name = "ALBUM_DURATION")
    private Time albumDuration;

    @Column(name = "ALBUM_RELEASE")
    private Date albumRelease;
}
