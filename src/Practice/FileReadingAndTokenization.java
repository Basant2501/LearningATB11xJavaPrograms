package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReadingAndTokenization {
    public static void main(String[] args) {
        String path="C:\\Users\\BASSHAW\\Desktop\\Test1.txt";
        BufferedReader reader=null;
        try {
            reader = new BufferedReader(new FileReader(path));
            //this fails (e.g. file not found, or permission denied)
            String line;
            while ((line=reader.readLine())!=null)
            {tokenizeLine(line);}
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not Present.\n" +e.getMessage());
            //throw new RuntimeException(e);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                reader.close();
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

    }
    private static void tokenizeLine (String line){
        StringTokenizer st = new StringTokenizer(line, ",");
        while (st.hasMoreTokens()){
            String Token=st.nextToken();
            System.out.println(Token);
        }
    }
}


