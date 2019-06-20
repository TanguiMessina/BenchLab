package com.example.app.benchlab.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Team implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<User> members;
    @ManyToMany
    private List<Institute> instituteList;
    private String name;


    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(List<User> members) {
        this.members = members;
    }

    public Team(String name, List<User> members) {
        this.members = members;
        this.name = name;
    }

    public Team(List<User> members, List<Institute> instituteList) {
        this.members = members;
        this.instituteList = instituteList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Institute> getInstituteList() {
        return instituteList;
    }

    public void setInstituteList(List<Institute> instituteList) {
        this.instituteList = instituteList;
    }
}
