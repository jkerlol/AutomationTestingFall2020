$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature1.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber plugin check",
  "description": "",
  "id": "cucumber-plugin-check",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Once you are in eclipse",
  "description": "",
  "id": "cucumber-plugin-check;once-you-are-in-eclipse",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "you have a cucumber script ready",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "we execute step one, make sure it runs ok",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "we move on to step three",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "we execute step three, make sure it runs ok",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "we execute step four, make sure that runs ok",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "we execute step five, make sure that runs ok",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "our test has completed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "featureTest1.you_have_a_cucumber_script_ready()"
});
formatter.result({
  "duration": 405081286,
  "status": "passed"
});
formatter.match({
  "location": "featureTest1.we_execute_step_one_make_sure_it_runs_ok()"
});
formatter.result({
  "duration": 90405,
  "status": "passed"
});
formatter.match({
  "location": "featureTest1.we_move_on_to_step_three()"
});
formatter.result({
  "duration": 522497,
  "status": "passed"
});
formatter.match({
  "location": "featureTest1.we_execute_step_three_make_sure_it_runs_ok()"
});
formatter.result({
  "duration": 452779,
  "status": "passed"
});
formatter.match({
  "location": "featureTest1.we_execute_step_four_make_sure_that_runs_ok()"
});
formatter.result({
  "duration": 448165,
  "status": "passed"
});
formatter.match({
  "location": "featureTest1.we_execute_step_five_make_sure_that_runs_ok()"
});
formatter.result({
  "duration": 528065,
  "status": "passed"
});
formatter.match({
  "location": "featureTest1.our_test_has_completed_successfully()"
});
formatter.result({
  "duration": 262549,
  "status": "passed"
});
formatter.uri("feature2.feature");
formatter.feature({
  "line": 1,
  "name": "yahoo signup validation",
  "description": "",
  "id": "yahoo-signup-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "we are on the signup page, with our elements loaded",
  "description": "",
  "id": "yahoo-signup-validation;we-are-on-the-signup-page,-with-our-elements-loaded",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "we have a sign up page to validate",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "we are on the webpage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "we should see the correct URL",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "we should the correct title",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the logo should load!",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "if the page is valid, close the page",
  "keyword": "Then "
});
formatter.uri("feature3.feature");
formatter.feature({
  "line": 1,
  "name": "facebook sign up validation",
  "description": "",
  "id": "facebook-sign-up-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "we have a page to test",
  "description": "",
  "id": "facebook-sign-up-validation;we-have-a-page-to-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a facebook signup page to test",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "we are on the signup page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "we verify our first name text box if it is valid then enter Mohammed in the text box",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "then we verify last name test box and enter Arafat in the text box",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "we verify logo for the last step and close the page",
  "keyword": "And "
});
formatter.match({
  "location": "facebookCucumberValidation.a_facebook_signup_page_to_test()"
});
formatter.result({
  "duration": 4033820231,
  "status": "passed"
});
formatter.match({
  "location": "facebookCucumberValidation.we_are_on_the_signup_page()"
});
formatter.result({
  "duration": 3415317836,
  "status": "passed"
});
formatter.match({
  "location": "facebookCucumberValidation.we_verify_our_first_name_text_box_if_it_is_valid_then_enter_Mohammed_in_the_text_box()"
});
formatter.result({
  "duration": 5082840060,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input\"}\n  (Session info: chrome\u003d86.0.4240.111)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027Mohammeds-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:cb8:e792:254:1e73%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.4\u0027, java.version: \u002712\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /var/folders/q7/6zb53fb558q...}, goog:chromeOptions: {debuggerAddress: localhost:51765}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b45e7c117d77847218672bb7b7689365\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat Pages.fbSignUpPage.getFirstName(fbSignUpPage.java:29)\n\tat stepDefinitions.facebookCucumberValidation.we_verify_our_first_name_text_box_if_it_is_valid_then_enter_Mohammed_in_the_text_box(facebookCucumberValidation.java:50)\n\tat ✽.Then we verify our first name text box if it is valid then enter Mohammed in the text box(feature3.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "facebookCucumberValidation.then_we_verify_last_name_test_box_and_enter_Arafat_in_the_text_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "facebookCucumberValidation.we_verify_logo_for_the_last_step_and_close_the_page()"
});
formatter.result({
  "status": "skipped"
});
});