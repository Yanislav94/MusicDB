package com.example.musicdb.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class Artist extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private BandEnum name;
    @Column(columnDefinition = "TEXT")
    private String careerInformation;

    public Artist(String name, String careerInformation) {
    }


    public BandEnum getBandEnum() {
        return name;
    }

    public void setBandEnum(BandEnum name) {
        this.name = name;
    }

    public String getCareerInformation() {
        return careerInformation;
    }

    public void setCareerInformation(String careerInformation) {
        this.careerInformation = careerInformation;
    }
}
