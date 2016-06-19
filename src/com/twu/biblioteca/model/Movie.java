package com.twu.biblioteca.model;

public class Movie {
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

    public boolean isInLibrary() {
        return isInLibrary;
    }

    private void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }

    public int getIsbn() {
        return isbn;
    }

}
