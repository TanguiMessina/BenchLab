package com.example.app.benchlab.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Institute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;
    @OneToOne
    private Address address;
    @ManyToMany
    private List<Team> teamList;

    public Institute() {
    }

    public Institute(String name) {
        Name = name;
    }

    public Institute(String name, Address address) {
        Name = name;
        this.address = address;
    }

    public Institute(String name, Address address, List<Team> teamList) {
        Name = name;
        this.address = address;
        this.teamList = teamList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }
}
