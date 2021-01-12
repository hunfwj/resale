package plus.nuc.resale.util;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadTest {


    @Test
    public void test() throws Exception {
        String urlAddress = "";
        URL url = new URL(urlAddress);

        URLConnection connection = url.openConnection();
        long contentLength = connection.getContentLengthLong();

        InputStream inputStream = connection.getInputStream();
    }
}
