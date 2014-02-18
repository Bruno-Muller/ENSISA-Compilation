package model;

import java.util.HashMap;

public class Instances {
	
	private static HashMap<String, Instance> instances;
	
	public Instances() {
		Instances.instances = new HashMap<String, Instance>();
	}
	
	public void setStructModels(StructModels sms) {
		for (Instance i : instances.values()) {
			i.setStructModel(sms.get(i.getModel()));
		}
	}
	
	public void assign(Assignement assignement) {
		String label = assignement.getLabel();
		String key = assignement.getKey();
		String val = assignement.getValue();
		
		Instance instance = Instances.instances.get(label);
		instance.put(key, val);
	}

	public void instanciate(Instanciation instanciation) {
		String label = instanciation.getLabel();
		String model = instanciation.getModel();
		Instance instance = new Instance(label, model);
		
		Instances.instances.put(label, instance);
	}
	
	public static Instance get(String label) {
		return Instances.instances.get(label);
	}

}
