import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		String packageName = main.getClass().getPackageName();
		
		URL url = Thread.currentThread().getContextClassLoader().getResource(packageName);
		String rootPath = url.getPath();
		
		//Remove the bin part and navigate to the project root directory
		rootPath = rootPath.replace("bin/main/", ""); //Eclipse bin path
		rootPath = rootPath.replace("build/classes/java/main/", ""); //Gradle bin path
		
		String jsonPath = rootPath + "tracker-radar/domains/DE/";
		
		System.out.println(rootPath);
		
		File file = new File(jsonPath);
		String[] files = file.list(new FilenameFilter() {
			@Override public boolean accept(File dir, String name) {
				return new File(dir, name).isFile();
			}
		});
		
		
		String output = "";
		
		for(String file1 : files) {
			file1 = jsonPath + file1;
			RootObject domainJson = main.loadConfig(file1);
			if(domainJson.fingerprinting > 1) {
				for(String subdomain : domainJson.subdomains) {
					String blocked = "||" + subdomain + "."	+ domainJson.domain + "^";
					if(subdomain.equals("www")) {
						System.out.println(blocked);
						continue;
					} 
					
					output += blocked + "\n";
				}
			}
		}
		
		String outputPath = rootPath + "converted-blocklist/";
		file = new File(outputPath + "/blocked_tracker.txt");
		try {
			FileUtils.touch(file);
			FileUtils.writeStringToFile(file, output, StandardCharsets.UTF_8); 
		} catch (IOException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		}
					
		 
	}
	
	public InputStream openFileForInput(String configFile) {
		File file = new File(configFile);
		try {
			FileInputStream fis = new FileInputStream(file);
			return fis;
		} catch (IOException e) {
			throw new RuntimeException("This is either a hard IO Exception like the harddisk is corrupt or a programming error.", e);
		}
	}
	
	public RootObject loadConfig(String configFile) {
		InputStream fis = openFileForInput(configFile);
		ObjectMapper mapper = new ObjectMapper();
		RootObject config;
		try {
			config = mapper.readValue(fis, RootObject.class);
		} catch (IOException e1) {
			throw new RuntimeException("This is either a hard IO Exception like the harddisk is corrupt or a programming error.", e1);
		}
		
		return config;
	}

}
