package com.jonaxel.example.mediaplayersample;

/**
 * Created by JonathanAxel on 14/04/15.
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
