package AdvancedDesignPatterns;

abstract class ReportExporter {
	public final void export() {
		fetchData();
		formatData();
		writeFile();
	}

	void fetchData() {
		System.out.println("Fetching data from DB");
	}

	abstract void formatData(); // Varies based on report type

	void writeFile() {
		System.out.println("Writing file to disk");
	}

}

//Concrete Templates 
class PdfExporter extends ReportExporter {
	void formatData() {
		System.out.println("Formatting data to PDF");
	}
}

class ExcelExporter extends ReportExporter {
	void formatData() {
		System.out.println("Formatting data to Excel");
	}
}
