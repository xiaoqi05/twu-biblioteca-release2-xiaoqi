package com.twu.biblioteca;

import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    private Movie movie;

    @Test
    public void shouldReturnTrueWhenCheckoutSuccess() throws Exception {
        movie = new Movie("Star Wars", "2016-5", "George Lucas", 5, true, 111);
        boolean result = movie.checkOutMovie();
        assertEquals(true, result);
        assertEquals(false, movie.isInLibrary());
    }

    @Test
    public void shouldReturnFalseWhenCheckoutUnSuccess() throws Exception {
        movie = new Movie("Star Wars", "2016-5", "George Lucas", 5, false, 111);
        boolean result = movie.checkOutMovie();
        assertEquals(false, result);
        assertEquals(false, movie.isInLibrary());
    }

}
