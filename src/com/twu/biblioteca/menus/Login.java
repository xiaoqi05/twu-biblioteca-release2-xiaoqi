package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public class Login extends Option {
    public Login(String name, int id) {
        super(name, id);
    }

    @Override
    public void run(Biblioteca biblioteca) {
        biblioteca.login();
    }
}
