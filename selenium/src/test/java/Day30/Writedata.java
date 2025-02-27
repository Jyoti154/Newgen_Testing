package Day30;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {


		FileOutputStream file=new 	FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();

		XSSFSheet sheet=	workbook.createSheet("workdata");

		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("123");
		row1.createCell(2).setCellValue("java");


		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("c#");
		row2.createCell(1).setCellValue("123");
		row2.createCell(2).setCellValue("paython");

		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("jyoti");
		row3.createCell(1).setCellValue("123");
		row3.createCell(2).setCellValue("arati");

		workbook.write(file);

		workbook.close();
		file.close();

		System.out.println("file is created.......");




		
	}

}
