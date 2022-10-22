package com.hillel.ahieiev.homework.homework1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class HelloWorld {

        public static void main(String[] args) throws IOException {
            URL url = new URL("https://www.youtube.com/watch?v=k286iLrwTxw");
            InputStream inputStream = url.openStream();
            byte[] boofer = inputStream.readAllBytes();
            String str = new String(boofer);
            System.out.println(str);
        }
}
