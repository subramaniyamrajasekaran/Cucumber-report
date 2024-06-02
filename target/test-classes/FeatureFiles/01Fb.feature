@feature1 @feature2
Feature: To validate login functionality of Facebook application
Background:
Given To launch the chrome browser and hit url
@static
Scenario: To validate emailfield and passwordfield

When  To pass the valid emailid in emailfield

|email1|abc@gamil.com|
|email2|def@gmail.com|
|email3|ghi@gmail.com|
|email4|jkl@gmail.com|
And   To pass the valid password in passwordfield
|pass1|pass2|pass3|
|dsdf|lkjhg|987|
|qwdf|nbgf|123|
|bhy|edhj|5678|
And  To click the login button
Then To close the chrome browser

@sanity
Scenario Outline: To validate emailfield,passwordfield positive and negative testcase
When   pass the valid  in"<emailfield>"emailfield
And     pass the valid  in "<password field>"passwordfield
And    click the login button
Then  close the chrome browser

Examples:
|emailfield|passwordfield|
|java@gmail.com|java|
|selenium@gmail.com|selenium|
|framework@gmail.com|framework|
|sql@gmail.com|sql|
