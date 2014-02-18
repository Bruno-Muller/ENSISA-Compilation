package model;

import java.util.HashMap;

public class StructModels {
	
	private HashMap<String, StructModel> structModels;
	
	public StructModels() {
		this.structModels = new HashMap<String, StructModel>();
	}
	
	public void put(StructModel structModel) {
		this.structModels.put(structModel.getLabel(), structModel);
	}
	
	public StructModel get(String label) {
		if (!this.structModels.containsKey(label)) throw new RuntimeException(label + " is not a StructModel");
		
		return this.structModels.get(label);
	}

}
