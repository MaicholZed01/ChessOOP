package utils;

import univaq.lpo.chess.model.IBoardGame;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SeralizactionUtils<T>{
    private String basePath;
    public SeralizactionUtils(String basePath){
        this.basePath = basePath;

    }
    // deserialize to Object from given file
    public T deserialize(String fileName) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(this.basePath+fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        T obj1 = (T) obj;
        return obj1;

    }
// serialize the given object and save it to file
        public void serialize(T obj, String fileName)
                throws IOException {
            ensureFolderExist();
            FileOutputStream fos = new FileOutputStream(this.basePath+fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);

            fos.close();
        }

    private void ensureFolderExist() {
        Path path = Paths.get(this.basePath);
        if(Files.notExists(path)){
            new File(this.basePath).mkdir();
        }
    }

}
