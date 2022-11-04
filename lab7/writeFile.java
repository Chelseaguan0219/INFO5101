import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public void write(String file, String data) {
        try{
            FileWriter writeFile = new FileWriter( file);
            writeFile.write(data);
            writeFile.close();

        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
