package driverScript;

import CommonFunLibrary.ERP_Functions;
import Utilities.ExcelFileUtil;
public class DriverScript {

	public static void main(String[] args) throws Exception {
		ExcelFileUtil excel=new ExcelFileUtil();

		int rowCount=excel.rowCount("supplier");

		ERP_Functions ef=new ERP_Functions();

		for (int i = 1; i < rowCount; i++) 
		{
			String Supplier_Name=excel.getData("supplier", i, 0);
			String Address= excel.getData("supplier", i, 1);
			String City=excel.getData("supplier", i, 2);
			String Country=excel.getData("supplier", i, 3);
			String Contact_Person= excel.getData("supplier", i, 4);
			String Phone_Number= excel.getData("supplier", i, 5);
			String Email=excel.getData("supplier", i, 6);
			String Mobile_Number= excel.getData("supplier", i, 7);
			String Notes=excel.getData("supplier", i, 8);

			ef.lanchAPP("http://webapp.qedge.com/login.php");
			ef.login("admin","master");

			String result=ef.supplier(Supplier_Name, Address, City, Country, Contact_Person, Phone_Number, Email, Mobile_Number, Notes);
			ef.closebrw();
			excel.setData("supplier", i, 9, result);			
		}
	}



}


