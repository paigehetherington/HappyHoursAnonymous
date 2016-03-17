package com.theironyard.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vajrayogini on 3/17/16.
 */
@Entity
@Table(name = "happy_hours")
public class HappyHour {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    String startTime;

    @Column(nullable = false)
    String endTime;

    @Column(nullable = false)
    ArrayList<String> days;

    @Column(nullable = false)
    List<String> specials;

    @Column(nullable = false)
    String image;

    public HappyHour() {
    }

    public HappyHour(String name, String address, String city, String startTime, String endTime, ArrayList<String> days, List<String> specials, String image) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.startTime = startTime;
        this.endTime = endTime;
        this.days = days;
        this.specials = specials;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

    public List<String> getSpecials() {
        return specials;
    }

    public void setSpecials(List<String> specials) {
        this.specials = specials;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
