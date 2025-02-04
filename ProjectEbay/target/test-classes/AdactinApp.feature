Feature: Validation of Login module
Scenario Outline: validation of correct username and correct password
Given user should be able to launch Adactin URL
When user enters "<username>" and "<password>" 
And user clicks the Login button
And user enters"<location>" "<Hotel>" "<room_type>" "<roomno>" "<checkindate>"
Then user verifies and login to Adactin app	

Examples:
|username|password|location|Hotel|room_type|roomno|checkindate|
|sangee123|Happy123|Sydney|Hotel Creek|Standard|2|07072022|
