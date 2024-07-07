package fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteRead {

	public static void main(String[] args) {

		File file = new File("D:\\javaFile.txt");
		try {
			file.createNewFile();
			
			FileWriter writeObject = new FileWriter(file);
			writeObject.write("Java File from Udemy Course By Motaaz Nabil !!");
			writeObject.flush();
			writeObject.close();
			
			BufferedReader readObject = new BufferedReader(new FileReader(file));
			String line;
			while((line = readObject.readLine()) != null) 
			{
				System.out.println(line);
			}
			readObject.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
