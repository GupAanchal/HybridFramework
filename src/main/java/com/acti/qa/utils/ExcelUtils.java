package com.acti.qa.utils;


import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelUtils(String excelPath) 
	{
		try
		{
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println("File Not Found : Excel Sheet not found" +e.getMessage());
		}
	}
	
	public int getRowCount(int sheetNum)
	{
		int count = wb.getSheetAt(sheetNum).getLastRowNum()+1;
		return count;
	}
	
	public String getCellData(int sheetNum,int row,int col)
	{
		String data = wb.getSheetAt(sheetNum).getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
