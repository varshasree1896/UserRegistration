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

}




