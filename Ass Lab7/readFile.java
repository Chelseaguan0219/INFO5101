import java.io.*;
import java.util.Scanner;


public class readFile {
    public String[] read(String pathname) throws Exception {
        File myObj = new File("/Users/chelsea/Desktop/annual.csv");
        Scanner myReader = new Scanner(myObj);
        int count = 0;
        String line;
        String nextLine = null;
           String resLine = null;
        while (myReader.hasNextLine()&& count <= 5) {
            String s1= myReader.nextLine().split(",")[0];
            String s2= myReader.nextLine().split(",")[1];
            String s3= myReader.nextLine().split(",")[2];
            resLine += s1 + "," + s2 + ","+ s3 + "\n";
            nextLine += myReader.nextLine() + "\n";
            count ++;
        }

            String[] res= new String[2];
            res[0] = resLine;
            res[1] = nextLine;
            return res;

    }
}
