package com.sindra.impExplorer.services;

import com.sindra.impExplorer.Impex.ImpexComponent;
import java.util.List;

public interface ImpexFileParser {
	List<ImpexComponent> getComponents(String impexFileString);
}
