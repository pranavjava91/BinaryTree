package AdvancedDesignPatterns;

public class Template_Example {

	public static void main(String[] args) {
		ReportExporter pdf = new PdfExporter();
		pdf.export();
		ReportExporter excel = new ExcelExporter();
		excel.export();
	}

}

/*
 * A Java application exports reports in different formats such as PDF and
 * Excel. The export process always follows the same steps: 1. Fetch data 2.
 * Format data 3. Write file Only the formatting step changes based on the file
 * type. If we place all these steps in each report class, we duplicate logic
 * and make the system harder to maintain. We need a design where the common
 * algorithm stays in one place, and only the specific formatting logic is
 * provided by subclasses. Which design pattern allows us to define a fixed
 * algorithm structure in a parent class while letting subclasses override only
 * selected steps?
 */
/*
 * This is done using the Template Method Pattern. The base class defines the
 * skeleton of the export process, and subclasses override only the formatting
 * step.
 */

/*
 * Template keeps the core algorithm fixed and lets subclasses change only the
 * parts that differ. This avoids code duplication and ensures consistent
 * workflow.
 */