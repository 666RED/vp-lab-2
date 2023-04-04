package com.hongchen.vp_lab2;
import java.util.Scanner;

public class Student {
	private String studentName;
	private char roomType;
	private double payrate;
	private final double rateForRoomA = 450.00;
	private final double rateForRoomB = 400.00;
	private final double rateForRoomC = 350.00;
	private final int numberOfSemester = 2;
	Scanner scanner = new Scanner(System.in);
	
	public Student() {
		displayMenu();
		setDetails();
		setRoom();
		selectRoom(this.roomType);
		displayDetails();
	}
	
	public Student(String studentName, char roomType) {
		this.studentName = studentName;
		this.roomType = roomType;
		selectRoom(roomType);
		displayDetails();
	}
	
	public void displayMenu() {
		System.out.println("Welcome to Online Hostel System\n");
		System.out.println("Room type available: \n");
		System.out.println("--------------------------------");
		System.out.println("|ROOM TYPE | RATE(per semester)|");
		System.out.println("|----------|-------------------|");
		System.out.println("|A \t   | RM 450.00\t       |");
		System.out.println("|B \t   | RM 400.00\t       |");
		System.out.println("|C \t   | RM 350.00\t       |");
		System.out.println("--------------------------------");
	}
	
	public void setDetails() {
		System.out.println("Student Name: ");
		studentName = scanner.nextLine();
	}
	
	public void setRoom() {
		System.out.println("Room Type: ");
		roomType = Character.toUpperCase(scanner.next().charAt(0));
	}
	
	public void selectRoom(char roomType) {
		switch(roomType) {
			case 'A':
				payrate = rateForRoomA * numberOfSemester;
				break;
			case 'B':
				payrate = rateForRoomB * numberOfSemester;
				break;
			case 'C':
				payrate = rateForRoomC * numberOfSemester;
				break;
			default:
				System.out.println("Invalid input");
		}
	}
	
	public void displayDetails() {
		System.out.print("\nStudent Name: " + studentName + "\n");
		System.out.print("Room Type: " + roomType + "\n");
		System.out.print("Charged Fee for one year: RM " + payrate + "\n");
	}
}
