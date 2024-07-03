package com.runner;

import com.readData.ReadData;
import com.readData.ReadDataExcelSheetXSSF;

public class TestReadData {

	public static void main(String[] args) throws Exception {
//		ReadData data = new ReadData();
//		
//		data.readExcelData();
		
		ReadDataExcelSheetXSSF rd = new ReadDataExcelSheetXSSF();
		rd.readData();
	}

}
