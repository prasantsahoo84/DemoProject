import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class WritingExcel {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("ManualWICreation");
/*		Row row0 = sh.createRow(0);
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("UserName");
		cellB.setCellValue("Password");*/
		
		for(int i =0;i<5;i++) {
			Row row = sh.createRow(i);
			for(int j = 0;j<5;j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue((double)(Math.random()*100));
			}
		}
		
		
		
		File f = new File("D:\\filewriting\\TestData.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		wb.close();
		System.out.println("File Writing Successful");
		
		

	}

}
