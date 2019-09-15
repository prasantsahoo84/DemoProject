import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws IOException{
		//First create the workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//Second create the sheet
		XSSFSheet sh = wb.createSheet();
		
		//Third create the row
		Row row = sh.createRow(1);
		
		//Create the cell
		Cell cell1 = row.createCell(0);
		Cell cell2 = row.createCell(1);
		
		//Insert the values inside the cell
		cell1.setCellValue("MyName");
		cell2.setCellValue("Age");
		
		//Now create a file
		File f = new File("D:\\filewriting\\runuFile.xlsx");
		
		FileOutputStream fout = new FileOutputStream(f);
		
		//write in the work book
		wb.write(fout);
		
		//close the work book
		wb.close();
		
		System.out.println("new excel file created");

		

	}

}
