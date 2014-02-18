package model;

public class Assignement {
	
	private String label, key, value;
	
	public Assignement(String label, String key, String value) {
		this.label = label;
		this.key = key;
		this.value = value;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public String getValue() {
		return this.value;
	}

}
