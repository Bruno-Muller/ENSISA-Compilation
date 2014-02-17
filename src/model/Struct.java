package model;

import java.util.HashMap;

public class Struct {
	
	private HashMap<String, DataType> dataType;
	private HashMap<String, String> dataValue;
	
	private static HashMap<String, Struct> struct;
	
	public static Struct getStruct(String name) {
		return Struct.struct.get(name);
	}
	
	public static Struct createStructDefinition(String structDefinitionName) {
		return new Struct(structDefinitionName);
	}
	
	public static Struct createStruct(String structName, String structDefinitionName) {
		return new Struct(structName, structDefinitionName);
	}
	
	private Struct(String structDefinitionName) {
		this.dataType = new HashMap<String, DataType>();
		Struct.struct.put(structDefinitionName, this);
	}
	
	private Struct(String structName, String structDefinitionName) {
		this.dataType = new HashMap<String, DataType>();
		// TODO recopier les datatype de structDefinitionName dans structName
		
		this.dataValue = new HashMap<String, String>();
		
		Struct.struct.put(structName, this);
	}

	public void putValue(String key, String value) {
		this.dataType.put(key, DataType.VAR);
		this.dataValue.put(key, value);
	}
	
	public void putPointer(String key, String value) {
		this.dataType.put(key, DataType.PTR);
		this.dataValue.put(key, value);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		// TODO, faire HTML ici
		// TODO genre avec des UL LUI
		
		for (String s : this.dataType.keySet()) {
			DataType dt = this.dataType.get(s);
			String v = this.dataValue.get(s);
			
			if (dt == DataType.VAR) {
				sb.append(s); // Typiquement, ca serait un LI
				sb.append(": ");
				sb.append(v);
			} else if (dt == DataType.PTR) {
				sb.append(Struct.getStruct(s).toString()); // et ca un UL dans dans un LI (des UL LI imbrique quoi)
			}
		}
		
		return sb.toString();
	}

}
