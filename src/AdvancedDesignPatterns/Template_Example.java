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

/*
 * An abstract class is a class that cannot be instantiated on its own and
 * serves as a blueprint for subclasses, while an abstract method is a method
 * declaration within an abstract class (or interface) that has no
 * implementation. The core difference is that an abstract class is a structural
 * component of inheritance, and an abstract method is a specific member of that
 * class (or an interface) that enforces a contract for implementation in
 * derived classes.
 * 
 */