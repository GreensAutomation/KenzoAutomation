Feature: Testing logical functionality of placing the order of a product and returing of the product

Scenario: user registering for new user profile
Given user launch the application
When user initiating the registration process
And user entering the personal details cum required fields for registration
And user completes the registration process
Then user receving the user id credentials details

@login
Scenario Outline: user checking the login function using valid username and valid password
Given user launch the application
When user enter the valid username "<username>" in username field
And user enter the valid password "<password>" in password field
And user click on login button
Then user confirm it navigates to the  homepage
Examples:
|username|password|
|lesakki24@gmail.com|India@2070|

@login
Scenario: user to select a producttype for booking a order 
Given user navigates to tshirt in men option
When user click on tshirt image to be booked
And user choose the color of the tshirt
And user choose the size of the tshirt
And user choose the addchart to hold the booking
Then user verifies selection of tshirt is done
