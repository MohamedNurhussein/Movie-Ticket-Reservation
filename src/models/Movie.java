/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author T-Man
 */
public class Movie {
    private String title, discription;
    private String category;
    private ImageIcon thumpnail;

    public Movie(String title, String discription, String category, ImageIcon thumpnail, int duration) {
        this.title = title;
        this.discription = discription;
        this.category = category;
        this.thumpnail = thumpnail;
        this.duration = duration;
    }
    public Movie(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ImageIcon getThumpnail() {
        return thumpnail;
    }

    public void setThumpnail(ImageIcon thumpnail) {
        this.thumpnail = thumpnail;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    private int duration; // in minutes
//    private List<Showtime> showtimes;
    
}
