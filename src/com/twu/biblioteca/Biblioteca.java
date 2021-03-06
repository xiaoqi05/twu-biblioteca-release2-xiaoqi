package com.twu.biblioteca;

import com.twu.biblioteca.menus.Option;
import com.twu.biblioteca.model.BibliorecaContent;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Biblioteca {
    private List<Book> bookList;
    private List<Movie> movieList;
    private List<Option> optionList;
    private List<User> userList;
    private Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;
    private boolean isLogin = false;

    public Biblioteca(BibliorecaContent provider) {
        this.bookList = provider.getBookList();
        this.movieList = provider.getMovieList();
        this.optionList = provider.getOptionList();
        this.userList = provider.getUserList();
    }

    void start() {
        showWelcomeMessage();
        showAllLibraryBooks();
        showMenu();
        showMenuChoseNote();
        while (isRunning) {
            showOptionAccordingToInput();
        }
    }

    private void showOptionAccordingToInput() {
        String userInput = scanner.nextLine();
        if (!checkMenuInputIsValid(userInput)) {
            showErrorInputMessage();
            return;
        }
        int userInputMenuId = Integer.parseInt(userInput);
        if (!isLogin && userInputMenuId != 1) {
            showLoginMessage();
            return;
        }
        for (Option option : optionList) {
            if (option.getId() == userInputMenuId) {
                option.run(this);
            }
        }

    }

    private void showLoginMessage() {
        consolePrint("please login\n");
    }

    private boolean checkMenuInputIsValid(String input) {
        if (isNumeric(input)) {
            int inputMenuId = Integer.parseInt(input);
            return !(inputMenuId <= 0 || inputMenuId > optionList.size());
        } else {
            return false;
        }
    }

    private void showMenuChoseNote() {
        consolePrint("please input menu id:\n");
    }


    private void showErrorInputMessage() {
        consolePrint("Select a valid option!\n");
    }

    void showWelcomeMessage() {
        consolePrint("welcome to Biblioteca\n");
    }

    private void consolePrint(String printContent) {
        System.out.print(printContent);
    }


    public void showAllLibraryBooks() {
        consolePrint("ShowAllBooks :\n");
        for (Book book : bookList) {
            if (book.isInLibrary()) {
                consolePrint(book.showBook() + "\n");
            }
        }
    }

    public void showMenu() {
        for (Option option : optionList) {
            consolePrint(option.getMenuString() + "  ");
        }
        consolePrint("\n");
    }

    private boolean isNumeric(String str) {
        if (str.equals("")) return false;
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public void quit() {
        this.isRunning = false;
        this.isLogin = false;
        consolePrint("Quit");
    }

    public void checkoutBook() {
        consolePrint("checkout book by isbn:\n");
        String userInput = scanner.nextLine();
        if (!isNumeric(userInput) || userInput.equals("")) {
            showCheckOutBookUnSuccessMessage();
            return;
        }
        boolean isValidBook = false;
        for (Book book : bookList) {
            if (book.getIsbn() == Integer.parseInt(userInput)) {
                isValidBook = true;
                boolean isCheckoutSuccess = book.checkOutBook();
                if (isCheckoutSuccess) {
                    consolePrint("you have checkout this book:\n" + book.showBook() + "\n");
                    showCheckOutBookSuccessMessage();
                } else {
                    showCheckOutBookUnSuccessMessage();
                }
            }
        }
        if (!isValidBook) {
            showCheckOutBookUnSuccessMessage();
        }
    }

    private void showCheckOutBookUnSuccessMessage() {
        consolePrint("That book is not available\n");
    }

    private void showCheckOutBookSuccessMessage() {
        consolePrint("Thank you! Enjoy the book\n");
    }

    public void returnBook() {
        consolePrint("return book by isbn:\n");
        String userInput = scanner.nextLine();
        if (!isNumeric(userInput) || userInput.equals("")) {
            showReturnUnSuccessMessage();
            return;
        }
        boolean isValidBook = false;
        for (Book book : bookList) {
            if (book.getIsbn() == Integer.parseInt(userInput)) {
                isValidBook = true;
                boolean isReturnSuccess = book.returnBook();
                if (isReturnSuccess) {
                    consolePrint("you have return this book:\n" + book.showBook() + "\n");
                    showReturnSuccessMessage();
                } else {
                    showReturnUnSuccessMessage();
                }
            }
        }
        if (!isValidBook) {
            showReturnUnSuccessMessage();
        }
    }

    private void showReturnUnSuccessMessage() {
        consolePrint("That is not a valid book to return\n");
    }

    private void showReturnSuccessMessage() {
        consolePrint("Thank you for returning the book\n");
    }

    public void showAllLibraryMovies() {
        consolePrint("ShowAllMovies :\n");
        for (Movie movie : movieList) {
            if (movie.isInLibrary()) {
                consolePrint(movie.showMovie() + "\n");
            }
        }
    }

    public void checkoutMovie() {
        consolePrint("checkout movie by isbn:\n");
        String userInput = scanner.nextLine();
        if (!isNumeric(userInput) || userInput.equals("")) {
            showCheckOutMovieUnSuccessMessage();
            return;
        }
        boolean isValidMovie = false;
        for (Movie movie : movieList) {
            if (movie.getIsbn() == Integer.parseInt(userInput)) {
                isValidMovie = true;
                boolean isCheckoutSuccess = movie.checkOutMovie();
                if (isCheckoutSuccess) {
                    consolePrint("you have checkout this book:\n" + movie.showMovie() + "\n");
                    showCheckOutMovieSuccessMessage();
                } else {
                    showCheckOutMovieUnSuccessMessage();
                }
            }
        }
        if (!isValidMovie) {
            showCheckOutMovieUnSuccessMessage();
        }
    }

    private void showCheckOutMovieSuccessMessage() {
        consolePrint("Thank you! Enjoy the movie\n");
    }

    private void showCheckOutMovieUnSuccessMessage() {
        consolePrint("That movie is not available\n");
    }

    public void login() {
        consolePrint("Login:\n");
        consolePrint("please input your library number :\n");
        String inputLibraryNumber = scanner.nextLine();
        boolean isValidUserInLibrary = false;
        for (User user : userList) {
            if (user.getLibraryNumber().equals(inputLibraryNumber)) {
                isValidUserInLibrary = true;
                isLogin = true;
                consolePrint("login success\n");
                consolePrint("login account is:\n" + user.showUserInfo() + "\n");
            }
        }
        if (!isValidUserInLibrary) {
            consolePrint("error user name\n");
        }
        showMenu();
    }
}
