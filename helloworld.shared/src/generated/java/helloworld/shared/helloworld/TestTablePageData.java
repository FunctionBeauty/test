package helloworld.shared.helloworld;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "helloworld.client.helloworld.TestTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class TestTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public TestTableRowData addRow() {
		return (TestTableRowData) super.addRow();
	}

	@Override
	public TestTableRowData addRow(int rowState) {
		return (TestTableRowData) super.addRow(rowState);
	}

	@Override
	public TestTableRowData createRow() {
		return new TestTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return TestTableRowData.class;
	}

	@Override
	public TestTableRowData[] getRows() {
		return (TestTableRowData[]) super.getRows();
	}

	@Override
	public TestTableRowData rowAt(int index) {
		return (TestTableRowData) super.rowAt(index);
	}

	public void setRows(TestTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class TestTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
	}
}
