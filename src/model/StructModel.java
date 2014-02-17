package model;

import java.util.HashMap;

public class StructModel {
	
	protected HashMap<String, DataType> dataType;
	protected static HashMap<String, StructModel> struct = new HashMap<String, StructModel>();
	
	public static StructModel getStruct(String name) {
		return StructModel.struct.get(name);
	}
	
	public static StructModel createStructModel(String structModelName) {
		return new StructModel(structModelName);
	}
	
	protected StructModel(StructModel model) {
		this.dataType = model.dataType;
	}
	
	private StructModel(String structModelName) {
		this.dataType = new HashMap<String, DataType>();
		StructModel.struct.put(structModelName, this);
	}
	
	public void putValue(String key) {
		this.dataType.put(key, DataType.VAR);
	}
	
	public void putPointer(String key) {
		this.dataType.put(key, DataType.PTR);
	}
	
}
