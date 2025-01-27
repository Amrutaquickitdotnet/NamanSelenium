package com.readData;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData {

	public void readExcelData() throws Exception {

		String path = "E:\\Naman\\ReadingDataFromExcel\\ExcelRead\\TestData.xls";

		FileInputStream fs = new FileInputStream(path);

		HSSFWorkbook wb = new HSSFWorkbook(fs);// creation of Excel workBook .xls

		HSSFSheet sh = wb.getSheet("Data");

		int totalNumberofRows = sh.getLastRowNum();

		for (int i = 0; i < totalNumberofRows; i++) {

			HSSFRow row = sh.getRow(i);// brings me single row

			// column dependency on rows

			int totalNumberOfColumns = row.getLastCellNum();

			for (int j = 0; j < totalNumberOfColumns; j++) {

				HSSFCell cell = row.getCell(j);

				System.out.print(cell.toString() + "\t");

				wb.close();

			}
			System.out.println("  ");
		}

	}

}
