package com.orangehrmbasictest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_reader implements Frameworkconstants
{
	 public static String Readdata(String Sheet,int row,int cell) throws Exception, IOException
	 {
	FileInputStream fis=new FileInputStream(excel_path);
	Workbook book=WorkbookFactory.create(fis);
	  Cell cel = book.getSheet(Sheet).getRow(row).getCell(cell);
	  String value = cel.getStringCellValue().toString();
	  return value;
	  
	 }
}
