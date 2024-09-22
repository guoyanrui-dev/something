package leet.code.self;

import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Alone {
    String string = "jkjnsdvir";

    @Test
    public void test() throws URISyntaxException, IOException {
        boolean isRight = (string.isEmpty()) ? true : false;
        System.out.println(isRight);
        Desktop desktop = Desktop.getDesktop();
        URI uri = new URI("http://baidu.com");
        desktop.browse(uri);

    }


}
