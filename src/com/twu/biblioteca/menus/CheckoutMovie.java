package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public class CheckoutMovie extends Option {
    public CheckoutMovie(String name, int id) {
        super(name, id);
    }

    @Override
    public void run(Biblioteca biblioteca) {
        biblioteca.checkoutMovie();
        biblioteca.showMenu();
    }
}
