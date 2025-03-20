package com.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alien")  // Ensure table name matches DB
public class Alien {
    @Id
    private int aid;
    private String aname;

    public Alien(String aname, int aid) {
        this.aname = aname;
        this.aid = aid;
    }

    public Alien() {}

    public String getAname() { return aname; }
    public void setAname(String aname) { this.aname = aname; }
    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }

    @Override
    public String toString() {
        return "Alien{" + "aid=" + aid + ", aname='" + aname + '\'' + '}';
    }
}
