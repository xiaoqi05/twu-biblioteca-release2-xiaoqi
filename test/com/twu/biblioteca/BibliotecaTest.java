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
        String expect = "welcome to Biblioteca\n";
        biblioteca.showWelcomeMessage();
        assertEquals(expect, bytes.toString());

    }

    @Test
    public void shouldShowAllLibraryBooksAfterWelcomeMessage() throws Exception {
        String expect = "ShowAllBooks :\n" +
                "bookName=time, author=xiaoqi,isbn=1, publishDate=2014-5\n" +
                "bookName=timess, author=xiaoq1i,isbn=2, publishDate=2014-5\n";
        biblioteca.showAllLibraryBooks();
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void shouldShowMenu() throws Exception {
        String expect = "1:Login  2:ShowAllBooks  3:CheckoutBook  4:ReturnBook  5:ShowAllMovies  6:CheckoutMovie  7:Quit  \n";
        biblioteca.showMenu();
        assertEquals(expect, bytes.toString());

    }
}
