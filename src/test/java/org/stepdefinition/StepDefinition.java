package org.stepdefinition;

import org.pom.Pom1;
import org.pom.Pom2;
import org.pom.Pom3;
import org.pom.Pom4;

import base.BaseClassCreation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition extends BaseClassCreation{
	
	static String orderId;
	Pom4 p;
	
	@Given("User should login by using {string}, {string} and click login button")
	public void userShouldLoginByUsingAndClickLoginButton(String username, String password) {
		Pom1 p=new Pom1();
		p.login(username, password);
	}

	
	@Given("User should enter the {string},{string},{string},{string},{string},{string},{string},{string} and click search button")
	public void userShouldEnterTheAndClickSearchButton(String location, String hotel, String roomtype, String noOfroom,
			String checkIn, String checkOut, String adultPerroom, String childPerroom) {
		Pom2 p = new Pom2();
		p.searchHotel(location, hotel, roomtype, noOfroom, checkIn, checkOut, adultPerroom, childPerroom);
	}

	@Then("User should click the checkbox and Search button")
	public void userClickTheCheckboxAndSearchButton() {
		Pom3 p = new Pom3();
		p.hotel();
	}
	@Then("User should enter some details like {string},{string},{string},{string},{string},{string},{string},{string} abd click Book Now button")
	public void user_should_enter_some_details_like_abd_click_Book_Now_button(String firstName, String lastName, String address, String ccno,String cctype,String exmonth,String exyear, String cvv) {
		p = new Pom4();
		p.payment(firstName, lastName, address, ccno, cctype, exmonth, exyear, cvv);
	
	}

	@Then("User should validate the Booking Confirmation")
	public void userShouldValidateTheBookingConfirmation() throws InterruptedException {
		Thread.sleep(12000);
		Pom4 p=new Pom4();
		p.orderid();

	}
}
