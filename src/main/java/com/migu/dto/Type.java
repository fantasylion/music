package com.migu.dto;

// Generated 2015-7-27 7:48:02 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Type generated by hbm2java
 */
//@Entity
//@Table(name = "type", catalog = "migu")
public class Type implements java.io.Serializable {

    private Integer typeid;
    private String name;
    private Integer ptid;
    private Set songs = new HashSet(0);

    public Type() {
    }

    public Type(String name, Integer ptid, Set songs) {
        this.name = name;
        this.ptid = ptid;
        this.songs = songs;
    }

//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "TYPEID", unique = true, nullable = false)
    public Integer getTypeid() {
        return this.typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

//    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Column(name = "PTID")
    public Integer getPtid() {
        return this.ptid;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    public Set getSongs() {
        return this.songs;
    }

    public void setSongs(Set songs) {
        this.songs = songs;
    }

}
