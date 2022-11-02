package org.itstep.task03;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getTRIANGLE_SIDE_1() {
        Triangle triangle = new Triangle(10, 15, 25);
        int actual = triangle.getTRIANGLE_SIDE_1();
        Assert.assertEquals(10, actual);
    }

    @Test
    void getTRIANGLE_SIDE_2() {
        Triangle triangle = new Triangle(10, 15, 25);
        int actual = triangle.getTRIANGLE_SIDE_2();
        Assert.assertEquals(15, actual);
    }

    @Test
    void getTRIANGLE_SIDE_3() {
        Triangle triangle = new Triangle(10, 15, 25);
        int actual = triangle.getTRIANGLE_SIDE_3();
        Assert.assertEquals(25, actual);
    }

    @Test
    void createTriangle() {
        Triangle triangle = new Triangle(15, 45, 10);
        Assertions.assertThrows(CreateTriangleException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                triangle.createTriangle();
            }
        });
    }
}