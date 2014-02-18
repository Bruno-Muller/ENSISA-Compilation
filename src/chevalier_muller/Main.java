package chevalier_muller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import model.Instance;
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
	
	public static void printInstance(Instance i)
	{
		String data = i.toString();
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("flight_plan.html", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("<!DOCTYPE html><html><head><link rel=\"stylesheet\" href=\"gangmaStyle.css\"><title>Flight Plan : MULLER & CHEVALIER</title></head><body><div id=\"content\">");
		writer.println("<h1>Demonstration projet compilation : FLIGHT PLAN</h1>");
		writer.println("<h2>by MULLER & CHEVALIER | 3A-IR ENSISA 2014</h2>");
		
		String[] paragraph = data.split("\n\n");
		for(int p = 0;p<paragraph.length;p++)
		{
			writer.println("<ul>");
			String[] line = paragraph[p].toString().split("\n");
			for(int l = 0;l<line.length;l++)
			{
				if(l==0)
				{
					writer.println("<li><h3>"+line[l]+"</h3></li>");
				}
				else
				{
					writer.println("<li>"+line[l]+"</li>");
				}
			}
			writer.println("</ul>");
		}
		writer.println("</div></body></html>");
		writer.close();
		System.out.println(i);
	}
}
