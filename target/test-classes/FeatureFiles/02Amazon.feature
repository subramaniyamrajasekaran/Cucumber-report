@feature2
Feature: To validate login functionality of Amazon application
Background:

Given  launch the  browser and hit url
@sanity @regression
Scenario: To validate invalidemail in emailfield and validpassword in passwordfield

Given  launch the  browser and hit url
When   pass the invalid emailid  or phonenum in emailfield
And    To click the continue button
And   pass the valid password in passwordfield
And  To click a sigin button
Then  close the  browser
@smoke
Scenario: To validate validemail in emailfield and validpassword in passwordfield

Given To launch the  browser and hit url
When   pass the valid emailid  or phonenum in emailfield
And    click the continue button
And   pass the invalid password in passwordfield
And   click a sigin button
Then  close the  browser in amzon


