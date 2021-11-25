package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void checkValidPassword() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("aaaS44@");
        Assert.assertSame(true,pass);
    }

}
