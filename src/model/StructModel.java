package model;

public class StructModel {
	
	private String label;
	private DataModels dataModels;
	
	public StructModel(String label, DataModels dataModels) {
		this.label = label;
		this.dataModels = dataModels;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public DataType getType(String key) {
		return this.dataModels.getType(key);
	}
	
}
