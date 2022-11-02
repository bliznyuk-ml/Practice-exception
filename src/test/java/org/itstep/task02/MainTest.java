package org.itstep.task02;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;


public class MainTest {

    @Test
    public void isGetPositiveNumber() {
        Assertions.assertThrows(NegativeNumberException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Main.getPositiveLessHundredNumber(-2);
            }
        });
    }

    @Test
    public void isGetLessHundredNumber() {
        Assertions.assertThrows(GreatHundredException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Main.getPositiveLessHundredNumber(101);
            }
        });
    }

    @Test
    public void isNormNumber() throws Exception {
        int actual = Main.getPositiveLessHundredNumber(10);
        Assertions.assertEquals(10, actual);
    }

}