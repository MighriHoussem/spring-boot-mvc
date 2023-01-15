package com.training.mvc.mvcspringboot.model;

public class Room {
    private long id;
    private String number;
    private String name;
    private String info;


    public Room(long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
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
