package helloworld.server.helloworld;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import helloworld.shared.helloworld.ITestService;
import helloworld.shared.helloworld.TestTablePageData;

public class TestService implements ITestService {

	@Override
	public TestTablePageData getTestTableData(SearchFilter filter) {
		TestTablePageData pageData = new TestTablePageData();
		// TODO [austin] fill pageData.
		return pageData;
	}
}
