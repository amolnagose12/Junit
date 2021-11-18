package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;

public class Test {
    @Test
    public  void firstName() throws Exception {
        UserValidation valid = new UserValidation();
        String result = valid.firstName("Amol");
        Assert.assertEquals(true, result);
    }
}