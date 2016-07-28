package com.aspose.cells.examples.RowsColumns;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class UnhidingRowsandColumns {

	public static void main(String[] args) throws Exception {
		// ExStart:UnhidingRowsandColumns
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(UnhidingRowsandColumns.class);

		// Instantiating a Workbook object
		Workbook workbook = new Workbook(dataDir + "workbook.xls");

		// Accessing the first worksheet in the Excel file
		Worksheet worksheet = workbook.getWorksheets().get(0);
		Cells cells = worksheet.getCells();

		// Unhiding the 3rd row and setting its height to 13.5
		cells.unhideRow(2, 13.5);

		// Unhiding the 2nd column and setting its width to 8.5
		cells.unhideColumn(1, 8.5);

		// Saving the modified Excel file in default (that is Excel 2003) format
		workbook.save(dataDir + "workbook.out.xls");

		// Print message
		System.out.println("Rows and Columns unhidden successfully.");
		// ExEnd:UnhidingRowsandColumns
	}
}
