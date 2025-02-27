package Day30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dynamicdata {

	public static void main(String[] args) throws IOException {


		FileOutputStream file=new 	FileOutputStream(System.getProperty("user.dir")+"\\testdata\\dynamic.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();

		XSSFSheet sheet=	workbook.createSheet("dynamicdata");
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter how many row?");
     int noOfrow=   sc.nextInt();
     
     System.out.println("enter how many cell?");
 int noOfcell=    sc.nextInt();
 
 
 for(int r=0;r<=noOfrow;r++)
 {
	 
	XSSFRow currentrow= sheet.createRow(r);
	 for(int c=0;c<noOfcell;c++)
	 {
	XSSFCell cell=	 currentrow.createCell(c);
	cell.setCellValue(sc.next());
	 }
 }
 
 workbook.write(file);
 workbook.close();
 file.close();
 
 System.out.println("file is created............");
 
 
	}

}
