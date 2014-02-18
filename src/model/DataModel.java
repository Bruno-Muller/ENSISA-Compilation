package model;

public class DataModel {
	
	private DataType dataType;
	private String label;
	
	
	public DataModel(String label, DataType dataType) {
		this.label = label;
		this.dataType = dataType;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public DataType getDataType() {
		return this.dataType;
	}

}
