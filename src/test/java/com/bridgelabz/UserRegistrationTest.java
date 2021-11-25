package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void checkValidName() {
        UserRegistration user = new UserRegistration();
        boolean check = user.validName("Nagose");
        Assert.assertSame(true, check);
    }

}
