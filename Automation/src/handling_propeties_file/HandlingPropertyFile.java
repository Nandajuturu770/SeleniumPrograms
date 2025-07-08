package handling_propeties_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
	public static void main(String[] args) throws IOException {
		// get the representative object of physical file
		FileInputStream fis = new FileInputStream("./data/commandata.property");
		// to create an object of property class
		Properties p  = new Properties();
		// to load the property
        p.load(fis);
        // to get the value by passing the key
        String url = p.getProperty("url");
        String un = p.getProperty("username");
        String pw = p.getProperty("password");
        System.out.println(url+"\n"+un+"\n"+pw);
	}
}
