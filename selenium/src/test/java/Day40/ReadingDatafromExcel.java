package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Data.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(file);

		XSSFSheet sheet=workbook.getSheet("data");
        
		int totalRows=sheet.getLastRowNum();
		int totalCells= sheet.getRow(1).getLastCellNum();


		System.out.println("number of row " + totalRows);
		System.out.println("number of cells " + totalCells);

		for( int r=0;r<=totalRows;r++)
		{


			XSSFRow currentrow=	sheet.getRow(r);


			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(cell.toString()+ "  ");

			}
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}
