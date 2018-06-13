package main.java.serialize;

import java.io.*;
import java.util.List;

public class FilmCollectionSerializetor {
    public static void serializator(String fileName, FilmsCollection collection) throws IOException{
        try(
                FileOutputStream write = new FileOutputStream(fileName);
                ObjectOutputStream serialize = new ObjectOutputStream(write);
        ) {
            serialize.writeObject(collection);
        }
    }

    public static FilmsCollection deserializator(String fileName) throws IOException, ClassNotFoundException {
        FilmsCollection deserializeCollection;
        try (
                FileInputStream read = new FileInputStream(fileName);
                ObjectInputStream deserialize = new ObjectInputStream(read)
        ) {
            deserializeCollection = (FilmsCollection)deserialize.readObject();
        }
        return deserializeCollection;
    }
}
