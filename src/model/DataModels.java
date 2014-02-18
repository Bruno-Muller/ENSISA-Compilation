package model;

import java.util.HashMap;

public class DataModels {
	
	private HashMap<String, DataType> dataModels;
	
	public DataModels() {
		this.dataModels = new HashMap<String, DataType>();
	}
	
	public void put(DataModel dataModel) {
		this.dataModels.put(dataModel.getLabel(), dataModel.getDataType());
	}
	
	public DataType getType(String key) {
		if (!this.dataModels.containsKey(key)) throw new RuntimeException(key + " is not a DataModel");
		
		return this.dataModels.get(key);
	}

}
