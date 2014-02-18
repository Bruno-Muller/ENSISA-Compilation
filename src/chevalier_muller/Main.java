package chevalier_muller;

import java.io.FileReader;
import java_cup.runtime.ComplexSymbolFactory;

public class Main {

	static public void main(String argv[]) {    
    try {
    	String name;
    	if (argv.length == 1) {
    		name = argv[0];
    	} else {
    		name = "flight_plan.txt";
    	}
    	ComplexSymbolFactory csf = new ComplexSymbolFactory ();
    	Lexer l = new Lexer(new FileReader(name));
    	l.setSymbolFactory(csf);
    	Parser p = new Parser(l, csf);
    	p.parse();
    } catch (Exception e) {
    	e.printStackTrace();
    }
  }
}
