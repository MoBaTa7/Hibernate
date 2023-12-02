package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Example {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        p.setProperty("id", "1234");
        p.setProperty("name", "ali");
        p.setProperty("age", "32");
        p.store(new FileOutputStream("person.properties"), null);
        p.storeToXML(new FileOutputStream("person.properties.xml"), null);

        p.load(new FileInputStream("person.properties"));
        System.out.println(p.getProperty("name"));
        p.list(System.out);

        p.loadFromXML(new FileInputStream("person.properties.xml"));
        p.list(System.out);


    }
}