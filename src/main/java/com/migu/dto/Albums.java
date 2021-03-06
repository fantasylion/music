package com.migu.dto;

// Generated 2015-7-27 7:48:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Albums generated by hbm2java
 */
//@Entity
//@Table(name = "albums", catalog = "migu")
public class Albums implements java.io.Serializable {

    private Integer albumsid;
    private Singer singer;
    private String name;
    private String initial;
    private Date comitdate;
    private Set songs = new HashSet(0);

    public Albums() {
    }

    public Albums(Singer singer, String name, String initial, Date comitdate,
            Set songs) {
        this.singer = singer;
        this.name = name;
        this.initial = initial;
        this.comitdate = comitdate;
        this.songs = songs;
    }

//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "ALBUMSID", unique = true, nullable = false)
    public Integer getAlbumsid() {
        return this.albumsid;
    }

    public void setAlbumsid(Integer albumsid) {
        this.albumsid = albumsid;
    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "SINGERID")
    public Singer getSinger() {
        return this.singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

//    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Column(name = "INITIAL")
    public String getInitial() {
        return this.initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

//    @Temporal(TemporalType.DATE)
//    @Column(name = "COMITDATE", length = 10)
    public Date getComitdate() {
        return this.comitdate;
    }

    public void setComitdate(Date comitdate) {
        this.comitdate = comitdate;
    }

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "albums")
    public Set getSongs() {
        return this.songs;
    }

    public void setSongs(Set songs) {
        this.songs = songs;
    }

}
