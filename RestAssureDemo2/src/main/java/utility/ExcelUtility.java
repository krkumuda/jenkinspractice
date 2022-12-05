package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	Workbook wb;
	public String getDataFromExcel(String excelPath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException{
		FileInputStream fisExcel = new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fisExcel);
		Sheet sheet=wb.getSheet(sheetName);
		String data=new DataFormatter().formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
		wb.close();
		return data;
		
	}
	public void openExcel(String excelPath) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelPath);
		wb=WorkbookFactory.create(fis);
	}
	public void setExcelData(String excelPath,String sheetName, int rowNum,int cellNum, int data) throws
	EncryptedDocumentException, IOException {
		FileInputStream fisExcel=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fisExcel);
		wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}
}
