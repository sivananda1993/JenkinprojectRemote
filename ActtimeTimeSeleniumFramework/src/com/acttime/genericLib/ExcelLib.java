package com.acttime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String fileP = "C:\\advanced\\ActtimeTimeSeleniumFramework\\TestData\\td.xlsx";
	
   public String getExcelData(String sheetName, int rowN, int colN) throws EncryptedDocumentException, InvalidFormatException, IOException{
   //get the location of the file
   FileInputStream fis = new FileInputStream(fileP);
   Workbook wb = WorkbookFactory.create(fis);
   Sheet sh = wb.getSheet(sheetName);
   Row row = sh.getRow(rowN);
       String data = row.getCell(colN).getStringCellValue();
   return data;
}
   
   public void setExcelData(String sheetName, int rowN, int colN, String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
	   FileInputStream fis = new FileInputStream(fileP);
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet(sheetName);
	   Row row = sh.getRow(rowN);
	   Cell cel = row.createCell(colN);
	   cel.setCellType(Cell.CELL_TYPE_STRING);

	   FileOutputStream fos = new FileOutputStream(fileP);
	  cel.setCellValue(data);
	   wb.write(fos);
	   wb.close();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}














