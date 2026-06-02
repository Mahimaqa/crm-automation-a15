package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement conLink;

	@FindBy(linkText = "Opportunities")
	private WebElement oppLink;

	@FindBy(css = "img[src='themes/softed/images/user.PNG']")
	private WebElement profileIcon;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getConLink() {
		return conLink;
	}

	public WebElement getOppLink() {
		return oppLink;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

}
