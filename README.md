# ecommerce



### Details of Automation:


### Assignment Details
-   Clicking the Add to Cart button on a product tile or on the product detail
    page should add the item to the cart dynamically.
-   Attempting to add a duplicate item to the cart should instead increment the
    quantity for that item.
-   It should be possible to change quantities and remove items on the cart
    page.
-   Cart totals should update appropriately.

### Application Used:

-   Shopizer-> http://aws-demo.shopizer.com:8080/shop/

### Automation Framework Details: Its a Page Object Model (POM)Based Framework

### Technologies Used: Selenium, Cucumber, Maven, Java, TestTNG

### Folder Structure: 
### src/test/resources: 
-   Cucumber feature files
-   Config files
-   Drivers(Chrome/Edge)
### src/main/java:
-   Page classes
-   Utilities/Config reader/Exception Handler
-   Step definitions
### src/test/java:
TestNG Runner file
### Reports
-   Test Reports and screenshots are kept here


### Test Details:
As given in the assignment, 3 testcases along with 1 negative testcase has been included 
(These testcases can be seen in the feature file - /eCommerce/src/test/resources/features/AddToCart.feature)
### Testcases:
-   Verify Clicking the Add to Cart button on a product tile or on the product detail
-   Verify Attempting to add a duplicate item to the cart should instead increment the
 quantity for that item.
-   Verify - It should be possible to change quantities and remove items on the cart page.
-   Negative testcase- Verifying Invalid quantity in the checkout  page


### How to read the report:
Report can be found at - https://github.com/SwathiShettyJ/ecommerce/tree/main/com.ecommerce/Reports/SparkReport%2026-Apr-21%2010-47-42/Output/Spark.html
(I have also  attached the report in the mail for easy access).

-   Download the folder : SparkReport 26-Apr-21 10-47-42
-   Open the Spark.html file inside Output folder with any browser
(Right click on Spark.html, open with any browser Eg:Chrome)
-   Click on each test case should open the detailed test steps along with Screenshot.
-   How to read the report video -> https://github.com/SwathiShettyJ/ecommerce/tree/main/com.ecommerce/AutomationReport.mp4

### Automation Execution:
I have attached the automation execution video in the mail. 
Also can be found -> https://github.com/SwathiShettyJ/ecommerce/tree/main/com.ecommerce/Automation.mp4




      









