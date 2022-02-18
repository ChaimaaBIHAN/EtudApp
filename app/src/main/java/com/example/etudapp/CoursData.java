package com.example.etudapp;

public class CoursData {

    private String cours;
    private String description;
    private String jointures;

    public CoursData(String cours, String description, String jointures) {
        this.cours = cours;
        this.description = description;
        this.jointures = jointures;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJointures() {
        return jointures;
    }

    public void setJointures(String jointures) {
        this.jointures = jointures;
    }
}
