import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public void write(String file, String data) throws IOException {
            FileWriter writeFile = new FileWriter(file);
            writeFile.write(data);
            writeFile.close();
    }
}
