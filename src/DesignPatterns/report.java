package DesignPatterns;

abstract class Report {
	protected ReportFormat format;

	Report(ReportFormat format) {
		this.format = format;
	}

	abstract void createReport();
}

// Refined Abstraction
class SalesReport extends Report {
	SalesReport(ReportFormat format) {
		super(format);
	}

	public void createReport() {
		format.generate("Sales Data");
	}
}

class InventoryReport extends Report {
	InventoryReport(ReportFormat format) {
		super(format);
	}

	public void createReport() {
		format.generate("Inventory Data");
	}
}
