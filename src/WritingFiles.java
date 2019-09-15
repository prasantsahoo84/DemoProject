import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Stream connectivity
		File f = new File("D:\\filewriting\\myTextFile.txt");
		//FileWriter fw = new FileWriter(f);
		FileWriter fw = new FileWriter(f,false);//if true it will not override it will append the value
		BufferedWriter bf = new BufferedWriter(fw);
		
/*		//Writing inside the file
		bf.write("boom boom");
		bf.newLine();
		bf.write("I love you");
		bf.newLine();
		bf.write("doom doom");*/
		
		//using for loop
		
		for(int i= 0;i<4;i++) {
			
			for(int j=0;j<3;j++) {
				int num = (int)(Math.random()*100);
				bf.write(num + "\t");
			}
			bf.newLine();
		}
		
		
		
		//closing the stream
		bf.close();
		
		

	}

}
