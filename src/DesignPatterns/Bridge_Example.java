package DesignPatterns;

public class Bridge_Example {
	public static void main(String[] args) {
		Report report1 = new SalesReport(new PDFFormat());
		report1.createReport();
		Report report2 = new InventoryReport(new ExcelFormat());
		report2.createReport();
	}

}


/*
 * In this example, the abstraction is the report itself, because it deals with
 * what data the report contains, like Sales, Inventory, or Customer
 * information. The implementation is the report format, because it defines how
 * the report is generated, such as PDF, Excel, or HTML. If these are mixed
 * directly, we get many unnecessary classes. By separating them, the
 * abstraction can focus on report content, and the implementation can handle
 * the output format. This makes both parts independent, so we can add new
 * report types or new formats without changing existing code. That is the core
 * reason to use the Bridge Pattern here. Bridge removes tight coupling between
 * abstraction and implementation. Both can grow independently, which keeps the
 * code clean and scalable.
 */