package com.twu.biblioteca.model;

public class Movie {
    //Movies have a name, year, director and movie rating (from 1-10 or unrated).
    private String name;
    private String year;
    private String director;
    private int rating;
    private boolean isInLibrary;
    private int isbn;

    public Movie(String name, String year, String director, int rating, boolean isInLibrary, int isbn) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.isInLibrary = isInLibrary;
        this.isbn = isbn;
    }

    public String showMovie() {
        return "name= " + name +
                ", director= " + director +
                ", year= " + year +
                ", rating= " + rating +
                ", isbn= " + isbn;


    }

    public boolean checkOutMovie() {
        if (!isInLibrary) return false;
        setInLibrary(false);
        return true;
    }

    public boolean returnMovie() {
        if (isInLibrary) return false;
        setInLibrary(true);
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    private void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
