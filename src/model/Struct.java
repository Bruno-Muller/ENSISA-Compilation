package model;

import java.util.HashMap;

public class Struct extends StructModel {
	
	private HashMap<String, String> dataValue;

	public static Struct createStruct(String structName, String structModelName) {
		return new Struct(structName, structModelName);
	}
	
	public static Struct getStruct(String structName) {
		return (Struct) StructModel.getStruct(structName);
	}
	
	private Struct(String structName, String structModelName) {
		super(StructModel.getStruct(structModelName));
		this.dataValue = new HashMap<String, String>();
		Struct.struct.put(structName, this);
	}
	
	public void put(String key, String value) {
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
