package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Users")
    public WebElement usersLink;

    @FindBy (xpath = "//a[@id=\"navbarDropdown\"]/span")
    public WebElement accountHolderName;

    @FindBy(xpath = "//table[@id=\"tbl_users\"]//th[.=\"Actions\"]")
    public WebElement ActionsColumn;

    @FindBy(xpath = "//table[@id=\"tbl_users\"]//th[.=\"Actions\"]/following-sibling::th[1]")
    public WebElement userIdColumn;

    @FindBy(xpath = "//table[@id=\"tbl_users\"]//th[.=\"Actions\"]/following-sibling::th[2]" )
    public WebElement nameColumn;

    @FindBy(xpath = "//table[@id=\"tbl_users\"]//th[.=\"Actions\"]/following-sibling::th[3]" )
    public WebElement emailColumn;

    @FindBy(xpath = "//table[@id=\"tbl_users\"]//th[.=\"Actions\"]/following-sibling::th[4]" )
    public WebElement groupColumn;

    @FindBy(xpath = "//table[@id=\"tbl_users\"]//th[.=\"Actions\"]/following-sibling::th[5]" )
    public WebElement statusColumn;



}
