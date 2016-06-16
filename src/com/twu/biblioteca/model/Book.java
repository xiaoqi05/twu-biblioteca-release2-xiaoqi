package com.twu.biblioteca.model;

public class Book {
    private String author;
    private String bookName;
    private String publishDate;
    private int isbn;
    private boolean isInLibrary;

    public Book(String author, String bookName, String publishDate, int isbn, boolean isInLibrary) {
        this.author = author;
        this.bookName = bookName;
        this.publishDate = publishDate;
        this.isbn = isbn;
        this.isInLibrary = isInLibrary;
    }

    public String showBook() {
        return "bookName=" + bookName +
                ", author=" + author +
                ",isbn=" + isbn +
                ", publishDate=" + publishDate;
    }

    /**
     * @return false means check fail means true check success
     */
    public boolean checkOutBook() {
        if (!isInLibrary) return false;
        setInLibrary(false);
        return true;
    }

    /**
     * @return false means return fail means true return success
     */
    public boolean returnBook() {
        if (isInLibrary) return false;
        setInLibrary(true);
        return true;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    private void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }
}
