package TestNG;

import org.testng.annotations.Test;

public class DriveaCar {
	@Test(priority = 0, enabled = false) //skip test cases
	public void Petrol() {
		System.out.println("Checking Petrol");
	}
	@Test(priority = 1)
	public void startTheCar() {
		System.out.println("Starting Car");
	}
	@Test(priority = 2)
	public void firstGear() {
		System.out.println("Put on first gear");
	}
	@Test(priority = 3)
	public void SecondGear() {
		System.out.println("Put on second Gear");
	}
	@Test(priority = 4)
	public void ThirdGear() {
		System.out.println("Put on Third Gear");
	}
	@Test(priority = 5, enabled = false)
	public void Ac() {
		System.out.println("Turn on AC");
	}
	@Test(priority = 6)
	public void music() {
		System.out.println("Play music");
	}
	@Test(priority = 7)
	public void Breakandidle() {
		System.out.println("break and idle");
	}
	@Test(priority = 8)
	public void reverse() {
		System.out.println("reverse the car");
	}
	@Test(priority = 9)
	public void Stop() {
		System.out.println("Stop the car");
	}
}
