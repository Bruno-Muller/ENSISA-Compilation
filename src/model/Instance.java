package model;

import java.util.HashMap;

public class Instance {
	
	private HashMap<String, String> data;
	private StructModel sm;
	private String model;
	private String label;
	
	public Instance(String label, String model) {
		this.data = new HashMap<String, String>();
		this.label = label;
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setStructModel(StructModel sm) {
		this.sm = sm;
	}
	
	public void put(String key, String value) {
		this.data.put(key, value);
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public DataType getDataType(String key) {
		if (this.sm == null) throw new RuntimeException(this.label + " has no StructModel");
		
		return this.sm.getType(key);
	}
	
	@Override
	public String toString()
	{
		
		/*
		// Version détaillé des élèments manipulés
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.label);
		sb.append(" is type of ");
		sb.append(this.sm.getLabel());
		sb.append("\n");
		
		for (String key : this.data.keySet()) {
			sb.append(key);
			sb.append(" is type of ");
			
			DataType dt = this.sm.getType(key);
			sb.append(dt);
			
			if (dt == DataType.VAR) {
				sb.append(" and has value ");
				sb.append(this.data.get(key));
				sb.append("\n");
			}
			else if (dt == DataType.PTR) {
				sb.append(" and has value :\n");
				sb.append(Instances.get(this.data.get(key)).toString());
			}
		}
		
		sb.append("\n");
			
		return sb.toString();
		*/
		
		
		// Version standard :
		StringBuilder sbb = new StringBuilder();
		
		for (String key : this.data.keySet())
		{
			sbb.append(key);
			
			DataType dt = this.sm.getType(key);
			
			if (dt == DataType.VAR) {
				sbb.append(" : ");
				sbb.append(this.data.get(key));
				sbb.append("\n");
			}
			else if (dt == DataType.PTR) {
				sbb.append(" informations :\n");
				sbb.append(Instances.get(this.data.get(key)).toString());
			}
			
		}
		
		sbb.append("\n");

		return sbb.toString();
	}
	
	
	

}
