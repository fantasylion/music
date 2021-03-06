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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Singer generated by hbm2java
 */
//@Entity
//@Table(name = "singer", catalog = "migu")
public class Singer implements java.io.Serializable {

    private Integer singerid;
    private Language language;
    private String name;
    private String birthplace;
    private String birthday;
    private Integer height;
    private Integer weight;
    private String gender;
    private String mv;
    private String initial;
    private String description;
    private Set albumses ;
    private Set songs;

    public Singer() {
    }

    public Singer(Language language, String name, String birthplace,
            String birthday, Integer height, Integer weight, String gender,
            String mv, String initial, String description, Set albumses,
            Set songs) {
        this.language = language;
        this.name = name;
        this.birthplace = birthplace;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.mv = mv;
        this.initial = initial;
        this.description = description;
        this.albumses = albumses;
        this.songs = songs;
    }

//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "SINGERID", unique = true, nullable = false)
    public Integer getSingerid() {
        return this.singerid;
    }

    public void setSingerid(Integer singerid) {
        this.singerid = singerid;
    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "LANID")
    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

//    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Column(name = "BIRTHPLACE")
    public String getBirthplace() {
        return this.birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

//    @Column(name = "BIRTHDAY")
    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

//    @Column(name = "HEIGHT")
    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

//    @Column(name = "WEIGHT")
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

//    @Column(name = "GENDER")
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    @Column(name = "MV")
    public String getMv() {
        return this.mv;
    }

    public void setMv(String mv) {
        this.mv = mv;
    }

//    @Column(name = "INITIAL")
    public String getInitial() {
        return this.initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

//    @Column(name = "DESCRIPTION", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "singer")
    public Set getAlbumses() {
        return this.albumses;
    }

    public void setAlbumses(Set albumses) {
        this.albumses = albumses;
    }

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "singer")
    public Set getSongs() {
        return this.songs;
    }

    public void setSongs(Set songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Singer [singerid=" + singerid + "]";
    }
    
    

}
