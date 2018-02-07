package com.sindra.impExplorer.services.impl;

import com.sindra.impExplorer.Impex.ImpexComponent;
import com.sindra.impExplorer.services.ImpexFileParser;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImpexFileParserImplTest {

	@Autowired private ImpexFileParser impexFileParser;

	@Test
	public void impexFileParserImplExists() {
		assertEquals(impexFileParser.getClass(), ImpexFileParserImpl.class);
	}

	@Test
	public void returnsEmptyListForEmptyFile() {
		List<ImpexComponent> impexComponents = impexFileParser.getComponents("");

		assertNull(impexComponents);
	}
}