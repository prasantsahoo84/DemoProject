import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class WritingHtml {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\filewriting\\My.html");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("<html><body><title>MyAutomation</title><h1>Learning Java Myself</h1></body> </html>");
		writer.close();

	}

}
