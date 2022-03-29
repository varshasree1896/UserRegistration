package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void checkValidName() {
        boolean check = UserRegistration.firstName("Varsha");
        Assertions.assertSame(true, check);
    }
    @Test
    public void checkValidName1() {
        boolean check = UserRegistration.lastName("Sree");
        Assertions.assertSame(true, check);
    }
    @Test
    public void checkValidEmail() {
        boolean check = UserRegistration.emailId("abc.xyz@bl.co.in");
        Assertions.assertSame(true, check);
    }
    @Test
    public void checkValidMobNumber() {
        boolean check = UserRegistration.mobileNumber("91 9397341248");
        Assertions.assertSame(true, check);
    }

}




