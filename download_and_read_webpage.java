package download_and_read_webpage;

import java.io.*;
import java.net.URL;

public class download_and_read_webpage {

    public static void main(String args[]) throws IOException {
        String url = "http://cpk.msu.ru/rating/dep_01";
        downloadWebPage(url);

        String file = "C:\\Users\\Prophet\\IdeaProjects\\ege_stats\\downloaded_url.html";
        readFile(file);
    }

    public static void downloadWebPage(String webpage) throws IOException {

            // Create URL object
            URL url = new URL(webpage);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // Enter filename in which you want to download
            BufferedWriter writer = new BufferedWriter(new FileWriter("downloaded_url_test.html"));

            // read each line from stream till end
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
            }
            reader.close();
            writer.close();
    }

    public static void readFile(String fileToRead) throws IOException {
        File file = new File(fileToRead);
        BufferedReader reader1 = new BufferedReader(new FileReader(file));
        String line1;
        while ((line1 = reader1.readLine()) != null) {
            System.out.println(line1);
        }
    }

}
