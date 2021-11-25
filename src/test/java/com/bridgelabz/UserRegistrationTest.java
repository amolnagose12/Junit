package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void checkValidPassword() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("aaZZa44@");
        Assert.assertTrue(pass);
    }

}
