import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadingFile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\filewriting\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		System.out.println(reader.readLine());
		String line = null;
		while((line = reader.readLine())!=null){
			
			System.out.println(line);
		}

	}

}
