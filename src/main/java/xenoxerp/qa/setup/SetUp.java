package xenoxerp.qa.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetUp {
	
	public static WebDriver driver;
	public static String url;
	public static Properties prop;
	public FileInputStream fis;
	public File file;
	public static String username;
	public static String password;
	public static String downloadFilePath;

     // Set Chrome preferences
    
	
	public SetUp()
	{
		file=new File("./src/main/resources/config.properties");
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initilization()
	{ 
		downloadFilePath=System.getProperty("user.dir")+"\\Downloads";
       Map<String, Object> prefs = new HashMap<>();
    prefs.put("profile.default_content_settings.popups", 0);
    prefs.put("download.default_directory",downloadFilePath);
    prefs.put("download.prompt_for_download", false);
    prefs.put("directory_upgrade", true);
    prefs.put("safebrowsing.enabled", true);

    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", prefs);
    
    DesiredCapabilities capabilities=new DesiredCapabilities();

    // Create a new instance of the Chrome driver with the specified options
    //http://3.95.160.237/ui/
    capabilities.setBrowserName("chrome");
    capabilities.setPlatform(Platform.LINUX);
    
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		url=prop.getProperty("url");
		username=prop.getProperty("username");
		password=prop.getProperty("password");  //http://34.227.8.154/
		try {
			driver=new RemoteWebDriver(new URL("http://34.227.8.154"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		
		
		
	}
	


}
