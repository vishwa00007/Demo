package com.crm.Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
	
	/*
	 * this is a generic mrthod to raed the data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return string
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi=new FileInputStream("./workbook.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		 String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
