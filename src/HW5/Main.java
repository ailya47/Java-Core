package HW5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("Workers.csv");
        if (file.exists()) {
            file.delete();
        }
        byte[] byteWorkers = null;
        ArrayList<Worker> workers = new ArrayList<>(Arrays.asList(
                new Worker("Ivan", 25, 50000),
                new Worker("Sergey", 23, 60000),
                new Worker("Stas", 29, 70000)
        ));
        if (!file.exists()) {
            file.createNewFile();
        }
        serializeWriteAndDeserializeRead(byteWorkers, workers);
    }

    public static void serializeWriteAndDeserializeRead(byte[] bytes, Object obj) {

        // запись объекта
        try (
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)
        ) {

            objectOutputStream.writeObject(obj);

            bytes = byteArrayOutputStream.toByteArray();
            System.out.println("Serialized " + Arrays.toString(bytes));


        } catch (IOException e) {
            e.printStackTrace();
        }

        // чтение объекта
        try (
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)
        ) {

            System.out.println(objectInputStream.readObject());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}