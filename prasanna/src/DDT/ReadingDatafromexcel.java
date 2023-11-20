package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDatafromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File file = new File("./testdata/data.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
//		Sheet sheet = workbook.getSheet("Sheet1");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(0);
//		String data = cell.toString();
//		System.out.println("data");
		String data = workbook.getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(data);
		
	}

}
