package org.itstep.task01;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        List<String> list = new List<String>(5);

        try {
            list.add("Potato");
            list.add("Tomato");
            list.add("Pepper");
            list.add("Cucumber");
            list.add("Onion");
            list.add("Banana");
        } catch (FullListException e) {
            //System.err.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Program add is complete");

        try {
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
        } catch (EmptyListException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Program remove is complete");

    }
}
