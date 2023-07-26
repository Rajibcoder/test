Feature: Buy Mobile Phone

Scenario: A user must be able to buy a mobile phone on Amazon
Given a user is in the LandingPage on amazon
When he clicks on Mobiles in the navigatiom bar
And he hovers the pointer over Mobiles & Accessories
And he clicks on Apple in the sub-menu
And he clicks on the second abailable phone
And he switches focus on the new tab
And he clicks on buy now button
Then he must be able to purchase the mobile phone successfully.
