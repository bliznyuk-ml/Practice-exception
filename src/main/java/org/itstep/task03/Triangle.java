package org.itstep.task03;

import java.util.Arrays;

public class Triangle {

    private final int TRIANGLE_SIDE_1;
    private final int TRIANGLE_SIDE_2;
    private final int TRIANGLE_SIDE_3;

    public Triangle(int TRIANGLE_SIDE_1, int TRIANGLE_SIDE_2, int TRIANGLE_SIDE_3) {
        this.TRIANGLE_SIDE_1 = TRIANGLE_SIDE_1;
        this.TRIANGLE_SIDE_2 = TRIANGLE_SIDE_2;
        this.TRIANGLE_SIDE_3 = TRIANGLE_SIDE_3;
    }

    public int getTRIANGLE_SIDE_1() {
        return TRIANGLE_SIDE_1;
    }

    public int getTRIANGLE_SIDE_2() {
        return TRIANGLE_SIDE_2;
    }

    public int getTRIANGLE_SIDE_3() {
        return TRIANGLE_SIDE_3;
    }

    public void createTriangle() throws CreateTriangleException {
        int arrSort[] = {TRIANGLE_SIDE_1, TRIANGLE_SIDE_2, TRIANGLE_SIDE_3};
        Arrays.sort(arrSort);
        if ((arrSort[0] + arrSort[1]) <= arrSort[2]) throw new CreateTriangleException("Unable to create a triangle");
        System.out.println(Arrays.toString(arrSort));
    }
}

class CreateTriangleException extends Exception {
    public CreateTriangleException(String message) {
        super(message);
    }
}
