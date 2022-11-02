package org.itstep.task05;

import javax.imageio.IIOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: проверяйте ваш код здесь
        Runner runner = new Runner();
        try {
            runner.halt();
        } catch (RuntimeException ex) {
            System.out.println("hult");
        } catch (Exception ex) {
            throw ex;
        }
    }
}
