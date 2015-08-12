package com.migu.dto;

// Generated 2015-7-27 7:48:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Song generated by hbm2java
 */
@Entity
@Table(name = "song", catalog = "migu")
public class Song implements java.io.Serializable {

    private Integer songid;
    private Singer singer;
    private Type type;
    private Albums albums;
    private String name;
    private String writer;
    private String compose;
    private String lyric;
    private String pic;
    private String initial;
    private Integer hits;
    private Date comitdate;

    public Song() {
    }

    public Song(Singer singer, Type type, Albums albums, String name,
            String writer, String compose, String lyric, String pic,
            String initial, Integer hits, Date comitdate) {
        this.singer = singer;
        this.type = type;
        this.albums = albums;
        this.name = name;
        this.writer = writer;
        this.compose = compose;
        this.lyric = lyric;
        this.pic = pic;
        this.initial = initial;
        this.hits = hits;
        this.comitdate = comitdate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "SONGID", unique = true, nullable = false)
    public Integer getSongid() {
        return this.songid;
    }

    public void setSongid(Integer songid) {
        this.songid = songid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SINGERID")
    public Singer getSinger() {
        return this.singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPEID")
    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ALBUMSID")
    public Albums getAlbums() {
        return this.albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }

    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "WRITER")
    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Column(name = "COMPOSE")
    public String getCompose() {
        return this.compose;
    }

    public void setCompose(String compose) {
        this.compose = compose;
    }

    @Column(name = "LYRIC", length = 500)
    public String getLyric() {
        return this.lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    @Column(name = "PIC")
    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Column(name = "INITIAL")
    public String getInitial() {
        return this.initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    @Column(name = "HITS")
    public Integer getHits() {
        return this.hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "COMITDATE", length = 10)
    public Date getComitdate() {
        return this.comitdate;
    }

    public void setComitdate(Date comitdate) {
        this.comitdate = comitdate;
    }

}