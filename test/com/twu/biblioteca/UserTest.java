package com.twu.biblioteca;

import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private User user;

    @Test
    public void shouldReturnTrueWhenLoginSuccess() throws Exception {
        String expect = "name=xiaoqi, email=xiaoqi@163.com, address=chengdu, libraryNumber=111-1111, phoneNumber=15682070830";
        user = new User("xiaoqi", "111", "xiaoqi@163.com", "chengdu", "111-1111", "15682070830");
        assertEquals(expect, user.showUserInfo());
    }

}
