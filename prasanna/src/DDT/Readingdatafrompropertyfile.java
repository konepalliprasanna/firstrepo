package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readingdatafrompropertyfile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/data.properties");
		Properties property = new Properties();
		property.load(fis);
		String value = property.getProperty("url");
		System.out.println(value);
	}

}
