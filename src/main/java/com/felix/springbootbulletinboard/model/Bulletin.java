package com.felix.springbootbulletinboard.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "bullet")
public class Bulletin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bulletinId")
    private Integer bulletinId;
    @Column(name = "title")
    private String title;
    @Column(name = "createdDate")
    private Date createdDate;
    @Column(name = "endDate")
    private Date endDate;

    public Integer getBulletinId() {
        return bulletinId;
    }

    public void setBulletinId(Integer bulletinId) {
        this.bulletinId = bulletinId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
