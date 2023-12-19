package cokm.takeo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintWriterDemo {
	public static void main(String mine[]) throws FileNotFoundException {
		File file = new File("C:\\Users\\katuw\\git\\eclipse\\IOStream\\src\\cokm\\takeo\\Hi");
		FileInputStream fis = null;
		try {
		fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			System.exit(0);
			System.out.println("JVM threw FileNotFoundException");
		}
		try {
			int i = fis.read();
		} catch (IOException | NullPointerException e) {
			// TODO Auto-generated catch block
			System.exit(0);
			System.out.println("JVM threw NullPointerException/IOException");
		}
		System.out.println("ENd Main method.......");
	}
}
