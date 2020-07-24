$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Kezso.feature");
formatter.feature({
  "line": 1,
  "name": "Testing logical functionality of placing the order of a product and returing of the product",
  "description": "",
  "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user registering for new user profile",
  "description": "",
  "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product;user-registering-for-new-user-profile",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user initiating the registration process",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user entering the personal details cum required fields for registration",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user completes the registration process",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user receving the user id credentials details",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 13078172900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_initiating_the_registration_process()"
});
formatter.result({
  "duration": 8148802100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_entering_the_personal_details_cum_required_fields_for_registration()"
});
formatter.result({
  "duration": 62743440900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_completes_the_registration_process()"
});
formatter.result({
  "duration": 5589269700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_receving_the_user_id_credentials_details()"
});
formatter.result({
  "duration": 45200,
  "status": "passed"
});
});