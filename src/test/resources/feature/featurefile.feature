Feature: Verifying Adactin Hotel booking

  Scenario Outline: Adactin Hotel Booking
    Given User should login by using "<username>", "<password>" and click login button
    And User should enter the "<Location>","<Hotels>","<Room type>","<Number of rooms>","<check in date>","<check out date>","<adults per room>","<children per room>" and click search button
    Then User should click the checkbox and Search button
    And User should enter some details like "<First Name>","<Last Name>","<Billing Address>","<credit card no>","<Credit card type>","<expiry month>","<expiry year>","<cvv>" abd click Book Now button
    Then User should validate the Booking Confirmation

    Examples: 
      | username   | password | Location | Hotels      | Room type | Number of rooms | check in date | check out date | adults per room | children per room | First Name | Last Name | Billing Address   | credit card no   | Credit card type | expiry month | expiry year | cvv |
      | naveen1612 | 3TGGMW   | Sydney   | Hotel Creek | Standard  | 1 - One         | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | VISA             | December     |        2021 | 123 |
