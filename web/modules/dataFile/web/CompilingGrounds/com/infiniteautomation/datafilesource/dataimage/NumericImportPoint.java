package com.infiniteautomation.datafilesource.dataimage;

import java.util.Map;

import com.infiniteautomation.datafilesource.dataimage.ImportPoint;

public class NumericImportPoint extends ImportPoint{
	
	public final double value;

	public NumericImportPoint(String identifier, double value, long time, Map<String, String> extraParams) {
		super(identifier, time, extraParams);
		this.value = value;
	}

	@Override
	public DataType getDataType() {
		return DataType.NUMERIC;
	}

}
