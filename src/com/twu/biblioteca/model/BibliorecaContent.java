package com.twu.biblioteca.model;

import com.twu.biblioteca.menus.Option;

import java.util.List;

public class BibliorecaContent {
    private List<Book> bookList;
    private List<Movie> movieList;
    private List<Option> optionList;
    private List<User> userList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public BibliorecaContent(List<Book> bookList, List<Movie> movieList, List<Option> optionList, List<User> userList) {
        this.bookList = bookList;
        this.movieList = movieList;
        this.optionList = optionList;
        this.userList = userList;
    }
}
