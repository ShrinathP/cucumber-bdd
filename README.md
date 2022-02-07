
1. Properties File Reading
2. Excel File Reading - todo
3. Cucumber multiple variables send - todo
4. Cucumber send Table - todo
5. Cucumber send Objects - todo
6. java.nio path
7. Take Screenshot TakesScreenshot
8. What is ThreadLocal ? Helps in parallel Execution - static Webdriver
   http://makeseleniumeasy.com/2020/04/11/problems-in-parallel-execution-with-static-webdriver/
   http://makeseleniumeasy.com/2020/05/27/threadlocal-static-webdriver-for-parallel-execution/
   NOTE - ThreadLocal is useful for Non TestNG based parallel testing
   - eg in CUCUMBER
9. @FindBy, @FindBys, @FindAll (OR), @CacheLookup
   /*
   Using @CacheLookup annotation,
   we will be losing one of the page factory benefit as it will find the element once
   and then keep a reference to it, hence, we are more likely to see StaleElementExceptions.
   */
10. AjaxElementLocatorFactory for initializing Elements
    PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

11. No And and But in StepDefinition file
    In a Step Definitions file, And and But are listed as Given/When/Then, the keyword that they appear after. 
    There are no And and But keywords in Step Definitions.

RemoteWebDriver implements Webdriver, TakesScreenShot
ChromeDriver extends RemoteWebDriver

so DownCasting to (or using in the first place) RemoteWebDriver or ChromeDriver will also allow you to use the method.

The method getScreenshotAs is implemented in RemoteWebDriver class. 
You can't use it from your driver instance because you used the WebDriver interface, which doesn't extends TakesScreenshot interface,
to create the driver instance.
Casting to (or using in the first place) RemoteWebDriver or ChromeDriver will also allow you to use the method.

