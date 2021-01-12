package plus.nuc.resale.util;

import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringTest {


    @Test
    public void test() throws IOException {
        String a = "test";
        String b = new String("test");
        String c = b.intern();

        System.out.println(a.equals(b));

        int index = a.indexOf("t");


        System.out.println(a == b);
        System.out.println(a == c);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");

        System.out.println(5 * 2);



        System.out.println(10 + (10 >> 1));
    }

    @Test
    public void testList() {
        ArrayList<Integer> arrayList = new ArrayList();
        LinkedList<Object> linkedList = new LinkedList<>();
[]

        System.out.println(this.getClass().toString());


    }
}