package guru99;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class LoginTest{
	public static void main(String[]args) {
		String celldata = null;
		try {
			String Userdirectory = System.getProperty("user.dir");
		
			FileInputStream fis = new FileInputStream(Userdirectory + "//mou.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String sheetname;
			Sheet sh = wb.getSheet(sheetname);
			DataFormatter formatter = new DataFormatter();
			int row;
			int col;
			Cell cellformat = sh.getRow(row).getCell(col);
			celldata = formatter.formatCellValue(cellformat);
			System.out.println(celldata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return celldata;
	}
}