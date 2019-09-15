import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\filewriting\\runuFile.xlsx");
		FileInputStream fin = new FileInputStream(f);
		
		//open the workbook
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sh = wb.getSheetAt(0);
		Row row = sh.getRow(1);
		Cell cell1 = row.getCell(0);
		Cell cell2 = row.getCell(1);
		
		System.out.println("cell1 value is :"+cell1+"Cell2 value is"+ cell2);
		
		wb.close();
		System.out.println("excelvalues retrived");

	}

}
