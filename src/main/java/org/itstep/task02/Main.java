package org.itstep.task02;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: проверяйте ваш код здесь
        //System.out.println(getPositiveLessHundredNumber(101));
        //System.out.println(getPositiveLessHundredNumber(-2));
        System.out.println(getPositiveLessHundredNumber(5));
    }

    public static int getPositiveLessHundredNumber(int number) throws Exception {
        if (number < 0) throw new NegativeNumberException("Number sub zero");
        if (number > 100) throw new GreatHundredException("Number greather, than 100");
        return number;
    }
}
