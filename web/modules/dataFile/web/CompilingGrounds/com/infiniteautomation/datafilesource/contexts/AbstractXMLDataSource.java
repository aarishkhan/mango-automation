package com.infiniteautomation.datafilesource.contexts;

import java.util.List;

import com.infiniteautomation.datafilesource.dataimage.ImportPoint;

/*
 * Version 1.0.0
 * @author Phillip Dunlap
 */

public interface AbstractXMLDataSource {
	public abstract List<ImportPoint> getParsedPoints();
}
