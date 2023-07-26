Feature: Verify Error Msg

Scenario: A user with invalid credentials must get an error message while logging in
Given a user is on the landing page
And he click on sign-in button
And he enters invalid email address in the email text box
And he click on the continue button
Then he must see the error message - "We We cannot find an account with that email address"