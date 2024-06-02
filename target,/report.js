$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/01Fb.feature");
formatter.feature({
  "name": "To validate login functionality of Facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@feature2"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbStep.to_launch_the_chrome_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate emailfield and passwordfield",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@feature2"
    },
    {
      "name": "@static"
    }
  ]
});
formatter.step({
  "name": "To pass the valid emailid in emailfield",
  "rows": [
    {
      "cells": [
        "email1",
        "abc@gamil.com"
      ]
    },
    {
      "cells": [
        "email2",
        "def@gmail.com"
      ]
    },
    {
      "cells": [
        "email3",
        "ghi@gmail.com"
      ]
    },
    {
      "cells": [
        "email4",
        "jkl@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbStep.to_pass_the_valid_emailid_in_emailfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid password in passwordfield",
  "rows": [
    {
      "cells": [
        "pass1",
        "pass2",
        "pass3"
      ]
    },
    {
      "cells": [
        "dsdf",
        "lkjhg",
        "987"
      ]
    },
    {
      "cells": [
        "qwdf",
        "nbgf",
        "123"
      ]
    },
    {
      "cells": [
        "bhy",
        "edhj",
        "5678"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbStep.to_pass_the_valid_password_in_passwordfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbStep.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate emailfield,passwordfield positive and negative testcase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "pass the valid  in\"\u003cemailfield\u003e\"emailfield",
  "keyword": "When "
});
formatter.step({
  "name": "pass the valid  in \"\u003cpassword field\u003e\"passwordfield",
  "keyword": "And "
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "close the chrome browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailfield",
        "passwordfield"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "java"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "selenium"
      ]
    },
    {
      "cells": [
        "framework@gmail.com",
        "framework"
      ]
    },
    {
      "cells": [
        "sql@gmail.com",
        "sql"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbStep.to_launch_the_chrome_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate emailfield,passwordfield positive and negative testcase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@feature2"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "pass the valid  in\"java@gmail.com\"emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_emailfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the valid  in \"\u003cpassword field\u003e\"passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_passwordfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbStep2.close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbStep.to_launch_the_chrome_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate emailfield,passwordfield positive and negative testcase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@feature2"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "pass the valid  in\"selenium@gmail.com\"emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_emailfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the valid  in \"\u003cpassword field\u003e\"passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_passwordfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbStep2.close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbStep.to_launch_the_chrome_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate emailfield,passwordfield positive and negative testcase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@feature2"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "pass the valid  in\"framework@gmail.com\"emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_emailfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the valid  in \"\u003cpassword field\u003e\"passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_passwordfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbStep2.close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbStep.to_launch_the_chrome_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate emailfield,passwordfield positive and negative testcase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@feature2"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "pass the valid  in\"sql@gmail.com\"emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_emailfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the valid  in \"\u003cpassword field\u003e\"passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.pass_the_valid_in_passwordfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbStep2.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbStep2.close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/02Amazon.feature");
formatter.feature({
  "name": "To validate login functionality of Amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature2"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the  browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon1.launch_the_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate invalidemail in emailfield and validpassword in passwordfield",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "launch the  browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon1.launch_the_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the invalid emailid  or phonenum in emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon1.pass_the_invalid_emailid_or_phonenum_in_emailfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon1.to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the valid password in passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon1.pass_the_valid_password_in_passwordfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click a sigin button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon1.to_click_a_sigin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the  browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon1.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the  browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon1.launch_the_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate validemail in emailfield and validpassword in passwordfield",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To launch the  browser and hit url",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon1.to_launch_the_browser_and_hit_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the valid emailid  or phonenum in emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon1.pass_the_valid_emailid_or_phonenum_in_emailfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon1.click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the invalid password in passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon1.pass_the_invalid_password_in_passwordfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click a sigin button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon1.click_a_sigin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the  browser in amzon",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon1.close_the_browser_in_amzon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});