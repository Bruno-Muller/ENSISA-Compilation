package model;

import java.util.HashMap;

public class Struct {
	
	private HashMap<String, DataType> data;
	private static HashMap<String, Struct> struct;
	
	public static Struct getStruct(String name) {
		return Struct.struct.get(name);
	}
	
	public Struct(String name) {
		this.data = new HashMap<String, DataType>();
		Struct.struct.put(name, this);
	}
	
	public void putVar(String s) {
		this.data.put(s, DataType.VAR);
	}
	
	public void putPtr(String s) {
		this.data.put(s, DataType.PTR);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		// TODO, faire HTML ici
		// TODO genre avec des UL LUI
		
		for (String s : this.data.keySet()) {
			DataType dt = this.data.get(s);
			
			if (dt == DataType.VAR) {
				sb.append(s); // Typiquement, ca serait un LI
			} else if (dt == DataType.PTR) {
				sb.append(Struct.getStruct(s).toString()); // et ca un UL dans dans un LI (des UL LI imbrique quoi)
			}
		}
		
		return sb.toString();
	}

}
