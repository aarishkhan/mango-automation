package com.infiniteautomation.datafilesource.dataimage;

import java.util.Map;

import com.infiniteautomation.datafilesource.dataimage.ImportPoint;

public class BinaryImportPoint extends ImportPoint {
	public final boolean value;
	
	public BinaryImportPoint(String identifier, boolean value, long time, Map<String, String> extraParams) {
		super(identifier, time, extraParams);
		this.value = value;
	}

	@Override
	public DataType getDataType() {
		return DataType.BINARY;
	}
	
	
}
