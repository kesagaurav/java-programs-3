package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Businness {

	
	public void openfile(String file) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream(file);
	}
}
