package com.infiniteautomation.datafilesource.dataimage;

import java.util.Map;

import com.infiniteautomation.datafilesource.dataimage.ImportPoint;

public class MultistateImportPoint extends ImportPoint {
	public final int value;
	
	public MultistateImportPoint(String identifier, int value, long time, Map<String, String> extraParams) {
		super(identifier, time, extraParams);
		this.value = value;
	}

	@Override
	public DataType getDataType() {
		return DataType.MULTISTATE;
	}
}
