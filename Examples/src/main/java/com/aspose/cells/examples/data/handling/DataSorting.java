package com.aspose.cells.examples.data.handling;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class DataSorting {

	public static void main(String[] args) throws Exception {
		// ExStart:DataSorting
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DataSorting.class);

		// Instantiate a new Workbook object.
		Workbook workbook = new Workbook(dataDir + "book1.xls");

		// Get the workbook datasorter object.
		DataSorter sorter = workbook.getDataSorter();

		// Set the first order for datasorter object.
		sorter.setOrder1(SortOrder.DESCENDING);

		// Define the first key.
		sorter.setKey1(0);

		// Set the second order for datasorter object.
		sorter.setOrder2(SortOrder.ASCENDING);

		// Define the second key.
		sorter.setKey2(1);

		// Sort data in the specified data range (CellArea range: A1:B14)
		CellArea cellArea = new CellArea();
		cellArea.StartRow = 0;
		cellArea.StartColumn = 0;
		cellArea.EndRow = 13;
		cellArea.EndColumn = 1;
		sorter.sort(workbook.getWorksheets().get(0).getCells(), cellArea);

		// Save the excel file.
		workbook.save(dataDir + "output.xls");

		// Print message
		System.out.println("Sorting Done Successfully");
		// ExEnd:DataSorting
	}
}
