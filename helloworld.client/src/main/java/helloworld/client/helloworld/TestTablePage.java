package helloworld.client.helloworld;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import helloworld.client.helloworld.TestTablePage.Table;
import helloworld.shared.helloworld.ITestService;
import helloworld.shared.helloworld.TestTablePageData;

@Data(TestTablePageData.class)
public class TestTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		// TODO [austin] verify translation
		return TEXTS.get("TestTablePage");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ITestService.class).getTestTableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
