package com.twu.biblioteca;

import com.twu.biblioteca.menus.*;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("xiaoqi", "time", "2014-5", 1, true));
        bookList.add(new Book("xiaoq1i", "timess", "2014-5", 2, true));

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Star Wars", "2016-5", "George Lucas", 5, true, 111));
        movieList.add(new Movie("Star Wars", "2016-5", "George Lucas", 5, true, 112));
        movieList.add(new Movie("Star Wars", "2016-5", "George Lucas", 5, true, 113));

        ArrayList<Option> optionList = new ArrayList<Option>();
        optionList.add(new ListBooks("ShowAllBook", 1));
        optionList.add(new checkoutBook("checkoutBook", 2));
        optionList.add(new returnBook("returnBook", 3));
        optionList.add(new ListMovies("ShowAllMovie", 4));
        optionList.add(new Quit("Quit", 5));

        Biblioteca biblioteca = new Biblioteca(bookList, movieList, optionList);
        biblioteca.start();

    }
}
