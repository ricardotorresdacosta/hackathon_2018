package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile extends AbstractModel {

    private String name;
    private int age;
    private String city;
    private String gender;
    private String eyeColor;
    private int height;
    private String image;

    private int eyeContact;
    private int mobileUsage;
    private int respectful;
    private int commitment;
    private int ignored;
    private int viewsNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getEyeContact() {
        return eyeContact;
    }

    public void setEyeContact(int eyeContact) {
        this.eyeContact = eyeContact;
    }

    public int getMobileUsage() {
        return mobileUsage;
    }

    public void setMobileUsage(int mobileUsage) {
        this.mobileUsage = mobileUsage;
    }

    public int getRespectful() {
        return respectful;
    }

    public void setRespectful(int respectful) {
        this.respectful = respectful;
    }

    public int getCommitment() {
        return commitment;
    }

    public void setCommitment(int commitment) {
        this.commitment = commitment;
    }

    public int getIgnored() {
        return ignored;
    }

    public void setIgnored(int ignored) {
        this.ignored = ignored;
    }

    public int getViewsNumber() {
        return viewsNumber;
    }

    public void setViewsNumber(int viewsNumber) {
        this.viewsNumber = viewsNumber;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", height=" + height +
                ", image='" + image + '\'' +
                ", eyeContact=" + eyeContact +
                ", mobileUsage=" + mobileUsage +
                ", respectful=" + respectful +
                ", commitment=" + commitment +
                ", ignored=" + ignored +
                ", viewsNumber=" + viewsNumber +
                '}';
    }
}
