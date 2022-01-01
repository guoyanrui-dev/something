package leet.code;

import org.testng.annotations.Test;

import java.io.*;

public class Io {
    //写点data
    @Test
    public static void write() throws IOException {
        FileWriter fileWriter = new FileWriter("data/test.csv", true);
        String content = "cnyy2022-1-1";
        fileWriter.write("\r"+content);
        fileWriter.close();
    }

    //读数据
    @Test
    public static void read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data/test.csv"));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            if (string.equals("")) {
                System.out.println("这一行没有东西");
            } else {
                System.out.println(string);
            }
        }
    }
}
