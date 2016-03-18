package com.theironyard.entities;

import javax.persistence.*;
import java.lang.reflect.Array;
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
    String phone;

    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    String startTime;

    @Column(nullable = false)
    String endTime;

    @Column(nullable = false)
    boolean onMonday = false;

    @Column(nullable = false)
    boolean onTuesday = false;

    @Column(nullable = false)
    boolean onWednesday = false;

    @Column(nullable = false)
    boolean onThursday = false;

    @Column(nullable = false)
    boolean onFriday = false;

    @Column(nullable = false)
    boolean onSaturday = false;

    @Column(nullable = false)
    boolean onSunday = false;


    @Column(nullable = false)
    ArrayList<String> specials;

    @Column(nullable = false)
    String image;

    public HappyHour() {

    }

    public HappyHour(String name, String address, String city, String phone, String startTime, String endTime, boolean onMonday, boolean onTuesday, boolean onWednesday, boolean onThursday, boolean onFriday, boolean onSaturday, boolean onSunday, ArrayList<String> specials, String image) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.startTime = startTime;
        this.endTime = endTime;
        this.onMonday = onMonday;
        this.onTuesday = onTuesday;
        this.onWednesday = onWednesday;
        this.onThursday = onThursday;
        this.onFriday = onFriday;
        this.onSaturday = onSaturday;
        this.onSunday = onSunday;
        this.specials = specials;
        this.image = image;
        this.phone = phone;
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

    public boolean isOnMonday() {
        return onMonday;
    }

    public void setOnMonday(boolean onMonday) {
        this.onMonday = onMonday;
    }

    public boolean isOnTuesday() {
        return onTuesday;
    }

    public void setOnTuesday(boolean onTuesday) {
        this.onTuesday = onTuesday;
    }

    public boolean isOnWednesday() {
        return onWednesday;
    }

    public void setOnWednesday(boolean onWednesday) {
        this.onWednesday = onWednesday;
    }

    public boolean isOnThursday() {
        return onThursday;
    }

    public void setOnThursday(boolean onThursday) {
        this.onThursday = onThursday;
    }

    public boolean isOnFriday() {
        return onFriday;
    }

    public void setOnFriday(boolean onFriday) {
        this.onFriday = onFriday;
    }

    public boolean isOnSaturday() {
        return onSaturday;
    }

    public void setOnSaturday(boolean onSaturday) {
        this.onSaturday = onSaturday;
    }

    public boolean isOnSunday() {
        return onSunday;
    }

    public void setOnSunday(boolean onSunday) {
        this.onSunday = onSunday;
    }

    public List<String> getSpecials() {
        return specials;
    }

    public void setSpecials(ArrayList<String> specials) {
        this.specials = specials;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
