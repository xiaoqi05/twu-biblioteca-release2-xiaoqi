package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(ContentProvider.getContent());
        biblioteca.start();

    }
}
