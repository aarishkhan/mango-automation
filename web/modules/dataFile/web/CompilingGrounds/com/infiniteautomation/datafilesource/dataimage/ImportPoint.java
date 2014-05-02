package com.infiniteautomation.datafilesource.dataimage;

import java.util.Map;

public abstract class ImportPoint {
	private final String identifier;
	private final long time;
	private final Map<String, String> extraParams;
	
	public enum DataType {ALPHANUMERIC, NUMERIC, MULTISTATE, BINARY};
	
	public ImportPoint(String identifier, long time, Map<String, String> params) {
		this.identifier = identifier;
		this.time = time;
		this.extraParams = params;
	}

	public String getIdentifier() {
		return this.identifier;
	}
	
	public long getTime() {
		return this.time;
	}
	
	public Map<String, String> getExtraParams() {
		return this.extraParams;
	}
	
	public abstract DataType getDataType();
}
