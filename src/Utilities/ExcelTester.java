package Utilities;

public class ExcelTester {

	public static void main(String[] args) throws Exception {
		ExcelFileUtil efu=new ExcelFileUtil();

		int totalRows=efu.rowCount("supplier");
		System.out.println(totalRows);

		int totalColumns=efu.colCount("supplier");
		System.out.println(totalColumns);

		String celldata=efu.getData("supplier", 3, 5);
		System.out.println(celldata);
		
		efu.setData("Supplier", 2, 10, "pass");

	}



}


