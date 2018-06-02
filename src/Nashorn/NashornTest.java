package Nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornTest {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		// TODO Auto-generated method stub

		ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");
		se.eval(new FileReader("C:\\Users\\katta\\Downloads\\test.js"));
	}

}
  