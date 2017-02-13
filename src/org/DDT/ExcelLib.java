package org.DDT;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelLib {
	
	Workbook wrkBook=null;
	Sheet sheet=null;
	
	public ExcelLib(String path){
		
		try {
			wrkBook=Workbook.getWorkbook(new File(path));
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String GetCellValue(int colNumber, int rowNumber){
		return wrkBook.getSheet(0).getCell(colNumber,rowNumber).getContents();
		
	}

}
