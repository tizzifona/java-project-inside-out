package dev.equipo3.insideout_java.models;

import java.time.LocalDateTime;

public class Moment {

    private static int idCounter = 1;
    private int id;
    private String title;
    private String description;
    private Emotions emotions;
    private LocalDateTime momentDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public Moment(int id, String title, String description, Emotions emotions, LocalDateTime momentDate) {
        this.id = idCounter++;
        this.title = title;
        this.description = description;
        this.emotions = emotions;
        this.momentDate = momentDate;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Emotions getEmotions() {
        return emotions;
    }

    public LocalDateTime getMomentDate() {
        return momentDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmotions(Emotions emotions) {
        this.emotions = emotions;
    }

    public void setMomentDate(LocalDateTime momentDate) {
        this.momentDate = momentDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return 
  "----------------------\n" +
  "Moment:\n" +
                "ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Emotion: " + emotions + "\n" +
                "Date: " + momentDate + "\n" +
                "Created: " + createdDate + "\n" +
                "Updated: " + updatedDate + "\n";
    }

}
