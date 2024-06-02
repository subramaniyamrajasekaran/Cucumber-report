package org.step;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	

	public static void reportJvm(String jsonPath) {
		File f=new File("C:\\Users\\Bharathi\\eclipse-workspace\\CucumberProject\\Jvm");
		Configuration c=new Configuration(f, "facebook&amazon");
		c.addClassifications("platformname", "windows");
		c.addClassifications("platform version", "10");
		c.addClassifications("browsername", "chrome");
		c.addClassifications("browser version","125.0.6422.78 ");
		
		List<String> li=new LinkedList<String>();
		li.add(jsonPath);
		
		ReportBuilder r=new ReportBuilder(li, c);
		r.generateReports();
	}

}
