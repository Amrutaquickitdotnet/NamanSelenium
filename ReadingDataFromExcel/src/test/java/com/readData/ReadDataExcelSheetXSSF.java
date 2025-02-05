package com.readData;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcelSheetXSSF {

	public void readData() throws Exception {

		String path = "E:\\Naman\\ReadingDataFromExcel\\ExcelRead\\DataSheet.xlsx";

		FileInputStream fs = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(fs);// Creation of workbook with extension .xlsx

		XSSFSheet sh = wb.getSheet("Sheet1");

		// iterator method always work with while

		Iterator<Row> itr = sh.iterator();// To get number of rows

		while (itr.hasNext()) {
			Row row = itr.next();// return me single row

			Iterator<Cell> cellIterator = row.cellIterator();// to get number of columns 
			
		while(cellIterator.hasNext()) {
			
		Cell cell =	cellIterator.next();
		
		
		switch (cell.getCellType()) {
		 case STRING:
			System.out.print(cell.getStringCellValue()+"\t");
			
			break;
			
		 case NUMERIC:
			 
			 if(DateUtil.isCellDateFormatted(cell)){
				 Date date = row.getCell(0).getDateCellValue();



                 //Get datetime
                 cell.getDateCellValue();
                 System.out.println(cell.getDateCellValue());
		        
		       
		      }else{
		          cell.getNumericCellValue();
		      }
			 System.out.print(cell.getNumericCellValue()+"\t");
				
				break;
				
		 case FORMULA:
			 System.out.print(cell.getCellFormula()+"\t");
				
				break;
		 case BLANK:
			 System.out.print(cell.getStringCellValue()+"\t");
				
				break;
		 case BOOLEAN:
			 System.out.print(cell.getBooleanCellValue()+"\t");
				
				break;
		
		default:
			
		}
		
		}
		System.out.println("");
		}

	}
}
