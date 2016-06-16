package com.twu.biblioteca;

import com.twu.biblioteca.menus.*;
import com.twu.biblioteca.model.BibliorecaContent;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;

public class ContentProvider {
    public static BibliorecaContent getContent() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("xiaoqi", "time", "2014-5", 1, true));
        bookList.add(new Book("xiaoq1i", "timess", "2014-5", 2, true));

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Star Wars", "2016-5", "George Lucas", 5, true, 111));
        movieList.add(new Movie("Star Wars", "2016-5", "George Lucas", 5, true, 112));
        movieList.add(new Movie("Star Wars", "2016-5", "George Lucas", 5, true, 113));

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("xiaoqi", "111", "xiaoqi@163.com", "chengdu", "111-1111", "15682070830"));
        userList.add(new User("xiaoqi2", "111", "xiaoqi@163.com", "chengdu", "111-1112", "15682070830"));
        userList.add(new User("xiaoqi3", "111", "xiaoqi@163.com", "chengdu", "111-1113", "15682070830"));

        ArrayList<Option> optionList = new ArrayList<Option>();
        //
        optionList.add(new Login("Login", 1));
        optionList.add(new ListBooks("ShowAllBooks", 2));
        optionList.add(new CheckoutBook("CheckoutBook", 3));
        optionList.add(new ReturnBook("ReturnBook", 4));
        optionList.add(new ListMovies("ShowAllMovies", 5));
        optionList.add(new CheckoutMovie("CheckoutMovie", 6));
        optionList.add(new Quit("Quit", 7));
        return new BibliorecaContent(bookList, movieList, optionList, userList);
    }
}
