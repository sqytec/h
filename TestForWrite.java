package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestForWrite {
	public static void main(String[] args){
		String s = "Write document to file.";
		File file = new File("test.txt");
		if (file.exists()){
			file.delete();
		}
		try {
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file.getName());
//			fileWriter.write(s);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(s);
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
