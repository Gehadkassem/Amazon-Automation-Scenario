# Amazon-Automation-Scenario
Amazon Automation Scenario
This project automates a scenario on the Amazon Egypt website using Selenium with Java.

Scenario Description
The automation script performs the following steps on the Amazon Egypt website:

Open the https://www.amazon.eg/ URL and login.
Open the "All" menu from the left side.
Click on "Video Games" and choose "All Video Games".
Apply the filters "Free Shipping" and "Condition: New" from the left-side filter menu.
Sort the products by price in descending order (high to low) from the right-side sort menu.
Add all products below 15k EGP to the cart. If no product is found, move to the next page.
Verify that all products are added to the cart.
Add address details and choose cash as the payment method.
Verify the total amount of all items with the shipping fees, if applicable.
Please note that the script does not proceed with placing an order.

Setup Instructions
To run the automation script on your machine, follow these steps:

Clone or download this GitHub repository
Ensure you have the following dependencies bundled with the project:
Selenium WebDriver
ChromeDriver (or any other suitable WebDriver executable)
Java JDK (version 8 or higher)
Set up your Java development environment (e.g., IntelliJ IDEA, Eclipse).
Import the project into your Java IDE.
Configure the project to include the necessary Selenium and WebDriver dependencies.
Update the Selenium WebDriver path in the code to match your local WebDriver executable path.
Run the AmazonAutomationScenario class to execute the automation script.
Please note that you might need to update the code to match any changes in the Amazon website structure.

Additional Details
The code is organized into separate methods to handle each step of the automation scenario.
Error handling and assertions are implemented to ensure proper execution and validation.
The code uses the ChromeDriver for automation, but you can use a different WebDriver by making the necessary changes in the code.
The automation scenario is designed for the Amazon Egypt website (https://www.amazon.eg/). Adjustments may be required for other Amazon regional websites.
This project is created using Java and Selenium WebDriver, ensuring cross-platform compatibility.
