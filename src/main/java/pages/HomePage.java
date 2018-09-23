package pages;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	Controller controller; 
	
	public HomePage(Controller controller){
		
		this.controller = controller; 
	}
	
	private By recentblogstext = By.cssSelector("#container > div:nth-child(2) > div:nth-child(3) > section > div > div.blog-post__listing-header > header > h2");
	private String topmenufirst ="//*[@id='navigationMenuWrapper']/div/ul/li[";
	private By topmenusecond = By.xpath("]/a/span");
	

	
	   public String RecentBlogs(){
		  // controller.driver.findElement(documents).click();
		   WebElement recentblogText=controller.driver.findElement(recentblogstext);
		   return recentblogText.getText();

	   }
	   
	   
	   public ArrayList<String> TopNavigationMenu(){
		   
		   ArrayList<String> menuText = new ArrayList<String>();
		   
		   for(int pageCount=1; pageCount <=3; pageCount++){
			   
			   controller.driver.findElement(By.xpath(topmenufirst +pageCount+topmenusecond)).click();
			   menuText.add(controller.driver.findElement(By.tagName("H1")).getText());
		   }
		   return menuText;
		   
	   }

}
