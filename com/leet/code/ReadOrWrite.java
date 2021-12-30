package leet.code;

import org.testng.annotations.Test;

import java.io.*;

public class ReadOrWrite {
    @Test
    public static void readData() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data/test.csv"));
        String string;
       while ((string=bufferedReader.readLine())!=null){
           if(string.equals("")){
               System.out.println("kong");
           }else {
               System.out.println(string);
           }
       }
    }

    @Test
    public static void writeData() throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/test.csv"));
//        bufferedWriter.newLine();
//        bufferedWriter.write("这是新加的一点东西");
//        bufferedWriter.close();
        FileWriter fileWriter = new FileWriter("data/test.csv", true);
        fileWriter.write("\r又加了一点点东西");
        fileWriter.close();

    }
}
