import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ReadingExcel {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException{
		// TODO Auto-generated method stub
		File f = new File("D:\\filewriting\\TestData.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet0 = wb.getSheetAt(0);
		/*Row row0 = sheet0.getRow(0);
		Cell cellA = row0.getCell(0);
		
		System.out.println("First Cell Value is --- " + cellA);*/
		
		for(Row row : sheet0) {
			for(Cell cell:row) {
				switch(cell.getCellType()) 
				{
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
				
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
					
				case Cell.CELL_TYPE_BLANK:
					System.out.println("Blank Cell" + "\t");
					break;
				
				
				}
			}
		}
		
		

	}

}
