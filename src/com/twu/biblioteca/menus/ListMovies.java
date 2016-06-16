package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public class ListMovies extends Option {

    public ListMovies(String name, int id) {
        super(name, id);
    }

    @Override
    public void run(Biblioteca biblioteca) {
        biblioteca.showAllLibraryMovies();
        biblioteca.showMenu();
    }
}
