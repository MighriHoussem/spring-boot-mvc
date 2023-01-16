package com.training.mvc.mvcspringboot.model;


import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ROOM_NUMBER")
    private String number;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BED_INFO")
    private String info;


    public Room(long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }
    public Room(){

    }

    public String getInfo() {
        return info;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
    public String getName() {
        return this.name;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString(){
        return "Room: " + this.id + " Name: " + this.name;
    }
}
