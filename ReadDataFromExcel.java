package com.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

		@Test
		public void ReadDataFromExcelFile() throws EncryptedDocumentException, IOException

		{			
			//Step 1 Read the excel file from the location

			FileInputStream fs = new FileInputStream("./InputTestData/Input.xlsx");

			//Step 2 assign the file to a Workbook class

			Workbook wb = WorkbookFactory.create(fs);

			//Step 3 Read the work sheet

			Sheet sh = wb.getSheet("Names");

			//Step 4 Read the row value

			Row rw = sh.getRow(1);

			//Step 5 To read the column value

			Cell celdata = rw.getCell(0);

			System.out.println("The value from the Excel sheet is " +celdata.getStringCellValue());
			
			System.out.println("To Read all the Names at one shot using Simple For Loop");

			for(int i=1;i<=sh.getLastRowNum();i++)
			{
				Row rowValue = sh.getRow(i);

				System.out.println(rowValue.getCell(0));
			}

			System.out.println("To Read all the Password value at one shot using Enhanced For Loop");
			
			//Enhanced for loop 
			
			for(Row rowvalue1:sh)
			{
				Cell passwordValue = rowvalue1.getCell(1);

				System.out.println(passwordValue);
			}
		}

}
