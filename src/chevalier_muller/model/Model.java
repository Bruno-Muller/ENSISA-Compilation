package chevalier_muller.model;

import java.util.HashMap;
import java.util.Map.Entry;

public class Model {
	
	private static Model self;
	
	private HashMap<String, Object> models;
	
	private Model() {
		this.models = new HashMap<String, Object>();
	}
	
	public static Model getInstance() {
		if (Model.self == null)
			Model.self = new Model();
		
		return Model.self;
	}
	
	public void put(String key , Object value) {
		this.models.put(key, value);
	}

	public void render(String model) {
		// TODO injecter le bordel dans du html
		
		for (Entry<String, Object> e : this.models.entrySet()) {
			if (String.class.equals(e.getValue().getClass())) {
				System.out.println(e.getKey() + e.getValue());
			}
			else if (HashMap.class.equals(e.getValue().getClass())) {
				// TODO faire un truc récursif sur les HashMap
			}
			else {
				System.out.println("Don't know what to do with object of type " + e.getValue().getClass());
			}
		}
	}

}
