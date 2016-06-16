package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @Before
    public void setUp() {

        biblioteca = new Biblioteca(ContentProvider.getContent());
        bytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bytes));
    }

    private ByteArrayOutputStream bytes;

    @Test
    public void shouldShowWelcomeMessageWhenStartTheApplication() throws Exception {
        biblioteca.showWelcomeMessage();
        assertEquals("welcome to Biblioteca\n", bytes.toString());

    }

    @Test
    public void shouldShowAllLibraryBooksAfterWelcomeMessage() throws Exception {
        biblioteca.showAllLibraryBooks();
        assertEquals("ShowAllBooks :\n" +
                "bookName=time, author=xiaoqi,isbn=1, publishDate=2014-5\n" +
                "bookName=timess, author=xiaoq1i,isbn=2, publishDate=2014-5\n", bytes.toString());
    }

    @Test
    public void shouldShowMenu() throws Exception {
        biblioteca.showMenu();
        assertEquals("1:Login  2:ShowAllBooks  3:CheckoutBook  4:ReturnBook  5:ShowAllMovies  6:CheckoutMovie  7:Quit  \n", bytes.toString());

    }
}
