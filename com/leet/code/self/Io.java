package leet.code.self;

import java.io.*;

/**
 * @author guoyanrui on 2022/1/13
 */
public class Io {
    //读点东西
    public static void readData(String string) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }

    //写点数据
    public static void write(String string) throws IOException {
        FileWriter fileWriter = new FileWriter(string, true);
        fileWriter.write("\rhello");
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        String string = "data/test.csv";
        write(string);
        readData(string);

    }
}
