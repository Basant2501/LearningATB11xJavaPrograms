package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingAndTokeniztion {
    public static void main(String[] args) {
        String path="C:\\Users\\BASSHAW\\Desktop\\Test.txt";
        try(BufferedReader reader= new BufferedReader(new FileReader(path))){
            String line;
            while ((line=reader.readLine())!=null){
            tokenizeline(line);
            }
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
        }
        static void tokenizeline(String line){
        String [] tokens=line.split(", ");
        for (String token : tokens){
            if (!token.isEmpty()){
                System.out.println(token);
            }
        }
        }
    }

