import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IqraTest {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		array[0] = "http://iqra.software/languages/java/list/definitions.html"; // Java definitions 90
		array[1] = "http://iqra.software/selenium/java/code/code-testng.html"; // Test Ng 55
		array[2] = "http://iqra.software/selenium/java/code/code-raman.html";  // Se code Raman
		array[3] = "http://iqra.software/languages/sql/sql.html";  // SQL 25
		array[4] = "http://iqra.software/languages/c/list/definitions.html";  // C# definitons
		array[5] = "http://iqra.software/languages/c/code/code-patrick.html";  // C# code Patrick
		*/
		
	    	    
		String[] array;
		array = new String[10];
		array[0] = "http://iqra.software/languages/java/list/definitions.html"; // Java definitions 90		
		array[1] = "http://iqra.software/selenium/java/code/code-raman.html";  // Se code Raman 145
		array[2] = "http://iqra.software/selenium/java/code/code-testng.html"; // Test Ng 55
		array[3] = "http://iqra.software/languages/sql/sql.html";  // SQL
		array[4] = "http://iqra.software/languages/c/list/definitions.html";  // C# definitons
		
		
		for(int n=0; n<=7; n++){
	    
	    for(int x=0; x<=4; x++){
	    System.setProperty("webdriver.chrome.driver", "C:\\softwares\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
	    driver.get(array[x]);	 
		switch (array[x])
	    
	    //driver.get("http://iqra.software/languages/java/list/definitions.html");	 
	    //switch ("http://iqra.software/languages/java/list/definitions.html")        	
	     
	    {
        
	    case "http://iqra.software/languages/java/list/definitions.html":  // Java definitions 90 : Case 0
	    	for(int i= 0; i <= 90; i++){
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	    	}
	    	break;
        
	    case "http://iqra.software/selenium/java/code/code-testng.html": // Test Ng 55 : Case 1
	        for(int i= 0; i <= 55; i++){
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);  
	        }
	        break;
	        
	    case "http://iqra.software/selenium/java/code/code-raman.html":  // Se code Raman 145 : Case 2
	        for(int i= 0; i <= 145; i++){
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	        }
	        break;
	        
	        
	    case "http://iqra.software/languages/sql/sql.html":  // SQL  25 : Case 3
	        for(int i= 0; i <= 25 ; i++){
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	        }
	        break;   
	        
	    case "http://iqra.software/languages/c/list/definitions.html":  // C# definitons  : Case 4
	        for(int i= 0; i <= 85; i++){
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	        }
	        break;           
	        
        
        default: 
        for(int i= 0; i <= 2; i++){
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
        }
        
        }   
	    	    
	    driver.quit();
	    }
	    
	     //driver.manage().window().maximize();
	  	 // driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);	
	    
	    /*String Firefoxdriverpath="C:\\softwares\\browsers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", Firefoxdriverpath);
        WebDriver driver=new FirefoxDriver();
        driver.get("http://google.com");
        driver.close(); 
        */
	    
		}

	}
}
