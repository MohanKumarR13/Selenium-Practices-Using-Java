package selenium.datadrivenframework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(".\\Files\\Countries.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <= row; i++) {
			XSSFRow xssfRow = sheet.getRow(i);
			for (int j = 0; j < column; j++) {
				String value = xssfRow.getCell(j).toString();
				System.out.print(" "+ value);
			}
			System.out.println();
		}

	}

}
