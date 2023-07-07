
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;


    public class ScenarioAutomation {
        WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.eg/");
    // Code to perform login, fill in the login form fields, and submit the form
    WebElement allMenu = driver.findElement(By.cssSelector("#nav-hamburger-menu"));
    allMenu.click();
        WebElement videoGames = driver.findElement(By.xpath("//div[@id='hmenu-content']//a[contains(text(),'Video Games')]"));
    videoGames.click();

        WebElement allVideoGames = driver.findElement(By.xpath("//span[contains(text(),'All Video Games')]"));
    allVideoGames.click();
        WebElement freeShippingFilter = driver.findElement(By.xpath("//span[contains(text(),'Free Shipping by Amazon')]"));
    freeShippingFilter.click();

        WebElement conditionFilter = driver.findElement(By.xpath("//span[contains(text(),'New')]"));
    conditionFilter.click();
        WebElement sortMenu = driver.findElement(By.cssSelector("select#s-result-sort-select"));
        Select sortSelect = new Select(sortMenu);
    sortSelect.selectByValue("price-desc-rank");
        List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    for (WebElement product: products) {
            String priceText = product.getText();
            double price = Double.parseDouble(priceText.replaceAll("[^\\d.]", ""));
            if (price < 15000) {
                WebElement addToCartButton = product.findElement(By.xpath("./ancestor::div[@data-component-type='s-search-result']//input[@value='Add to Cart']"));
                addToCartButton.click();
            }
        }

        // Check if there are more pages and navigate to the next page if available
        WebElement nextPageButton = driver.findElement(By.xpath("//a[@title='Next page']"));
    if (nextPageButton.isEnabled()) {
            nextPageButton.click();
            // Repeat the process for the next page
        }


    }
