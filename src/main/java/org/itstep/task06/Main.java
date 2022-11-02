package org.itstep.task06;

import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        //XmlReader xmlReader = new XmlReader();
        XmlReader[] reader = new XmlReader[5];

        for (int i = 0; i < reader.length; i++) {
            reader[i] = new XmlReader();
        }

        readXml(reader);
    }


    public static void readXml(XmlReader[] reader) {
        for (XmlReader m : reader) {
            try {
                m.read();
            } catch (FileSystemAlreadyExistsException ex) {
                ex.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
