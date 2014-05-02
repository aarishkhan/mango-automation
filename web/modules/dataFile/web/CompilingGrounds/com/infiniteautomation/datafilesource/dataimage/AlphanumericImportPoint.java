package com.infiniteautomation.datafilesource.dataimage;

import java.util.Map;

import com.infiniteautomation.datafilesource.dataimage.ImportPoint;

public class AlphanumericImportPoint extends ImportPoint {
	
	public final String value;

	public AlphanumericImportPoint(String value, String identifier, long time, Map<String, String> extraParams) {
		super(identifier, time, extraParams);
		this.value = value;
	}

	@Override
	public DataType getDataType() {
		return DataType.ALPHANUMERIC;
	}

}
