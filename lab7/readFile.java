import java.io.*;


public class readFile {
    public String[] read(String pathname) throws Exception {
        File file = new File("/Users/chelsea/Desktop/annual.csv");
        BufferedReader in = new BufferedReader(new FileReader(file));
        String s;
        String S = null;
        String total = null;
        int count = 0;
        while ((s = in.readLine())!= null && count <= 5) {
            String s1= s.split(",")[0];
            String s2= s.split(",")[1];
            String s3= s.split(",")[2];
            total += s1 + "," + s2 + ","+ s3 + "\n";
            S += s + "\n";
            count ++;
        }
        String[] res= new String[2];
        res[0] = total;
        res[1] = S;
        return res;
    }
}
