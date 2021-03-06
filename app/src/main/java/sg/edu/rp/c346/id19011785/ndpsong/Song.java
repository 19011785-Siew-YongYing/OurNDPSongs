package sg.edu.rp.c346.id19011785.ndpsong;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Song implements Serializable {

    private int id;
    private String title;
    private String singers;
    private int years;
    private int stars;

    public Song(int id, String title, String singers, int years, int stars) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.years = years;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingers() {
        return singers;
    }

    public void setSingers(String singers) {
        this.singers = singers;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        //return "Title: " + title + "\nSinger: " + singers + "\nYear: " + years + "\nStars: " + stars;
        String starsStr = "";
        for (int i = 0; i < stars; i++){
            starsStr += "*";
        }
        //return title + "\n" + singers + " - " + years + "\n" + starsStr;
        return starsStr; // Problem 10 - Enhancement
    }
}
