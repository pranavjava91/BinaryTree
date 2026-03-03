package DesignPatterns;

public class PDFFormat implements ReportFormat {
	public void generate(String data) {
		System.out.println("PDF Report: " + data);
	}

}
