package DesignPatterns;

public class ExcelFormat implements ReportFormat {

	public void generate(String data) {
		System.out.println("Excel Report: " + data);

	}

}
