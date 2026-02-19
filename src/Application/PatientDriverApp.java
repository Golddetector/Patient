package Application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PatientDriverApp extends Application{
	

	public void start(Stage stage) {
		Label label1 = new Label("hello1");
		Label label2 = new Label("hello2");
		Label label3 = new Label("hello3");
		
		Button showOutputButton = new Button("Show Output");
		Button exitButton = new Button("Exit");
		Button savePatient = new Button("savePatient");
		Button saveProcedure1 = new Button("Save Procedure 1");
		Button saveProcedure2 = new Button("Save Procedure 2");
		Button saveProcedure3 = new Button("Save Procedure 3");
		
		TextArea textOutput = new TextArea();
		
		GridPane patientInfoGrid = new GridPane();
		patientInfoGrid.add(new Label("First Name"), 0, 0);
		patientInfoGrid.add(new TextField(), 1, 0);
		
		patientInfoGrid.add(new Label("Middle Name"), 0, 1);
		patientInfoGrid.add(new TextField(), 1, 1);
		
		patientInfoGrid.add(new Label("Last Name"), 0, 2);
		patientInfoGrid.add(new TextField(), 1, 2);
		
		patientInfoGrid.add(new Label("Address"), 0, 3);
		patientInfoGrid.add(new TextField(), 1, 3);
		
		patientInfoGrid.add(new Label("City"), 0, 4);
		patientInfoGrid.add(new TextField(), 1, 4);
		
		patientInfoGrid.add(new Label("State"), 0, 5);
		patientInfoGrid.add(new TextField(), 1, 5);
		
		patientInfoGrid.add(new Label("State"), 0, 6);
		patientInfoGrid.add(new TextField(), 1, 6);
		
		patientInfoGrid.add(new Label("ZIP"), 0, 7);
		patientInfoGrid.add(new TextField(), 1, 7);
		
		patientInfoGrid.add(new Label("Phone"), 0, 8);
		patientInfoGrid.add(new TextField(), 1, 8);
		
		patientInfoGrid.add(new Label("Emergency Name"), 0, 9);
		patientInfoGrid.add(new TextField(), 1, 9);
		
		patientInfoGrid.add(new Label("Emergency Phone"), 0, 10);
		patientInfoGrid.add(new TextField(), 1, 10);
		
		patientInfoGrid.add(savePatient, 0, 11);
		
		VBox patientInfoBox = new VBox(10);
		patientInfoBox.getChildren().add(patientInfoGrid);
		
		GridPane procedure1Grid = new GridPane();
		procedure1Grid.add(new Label("Name"), 0, 0);
		procedure1Grid.add(new TextField(), 1, 0);
		
		procedure1Grid.add(new Label("Date"), 0, 1);
		procedure1Grid.add(new TextField(), 1, 1);
		
		procedure1Grid.add(new Label("Practioner"), 0, 2);
		procedure1Grid.add(new TextField(), 1, 2);
		
		procedure1Grid.add(new Label("Charge($)"), 0, 3);
		procedure1Grid.add(new TextField(), 1, 3);
		
		procedure1Grid.add(saveProcedure1, 0, 4);
		
		VBox procedure1Box = new VBox(10);
		procedure1Box.getChildren().add(procedure1Grid);
		
		
		GridPane procedure2Grid = new GridPane();
		procedure2Grid.add(new Label("Name"), 0, 0);
		procedure2Grid.add(new TextField(), 1, 0);
		
		procedure2Grid.add(new Label("Date"), 0, 1);
		procedure2Grid.add(new TextField(), 1, 1);
		
		procedure2Grid.add(new Label("Practioner"), 0, 2);
		procedure2Grid.add(new TextField(), 1, 2);
		
		procedure2Grid.add(new Label("Charge($)"), 0, 3);
		procedure2Grid.add(new TextField(), 1, 3);
		
		procedure2Grid.add(saveProcedure2, 0, 4);
		
		VBox procedure2Box = new VBox(10);
		procedure2Box.getChildren().add(procedure2Grid);
		
		
		GridPane procedure3Grid = new GridPane();
		procedure3Grid.add(new Label("Name"), 0, 0);
		procedure3Grid.add(new TextField(), 1, 0);
		
		procedure3Grid.add(new Label("Date"), 0, 1);
		procedure3Grid.add(new TextField(), 1, 1);
		
		procedure3Grid.add(new Label("Practioner"), 0, 2);
		procedure3Grid.add(new TextField(), 1, 2);
		
		procedure3Grid.add(new Label("Charge($)"), 0, 3);
		procedure3Grid.add(new TextField(), 1, 3);
		
		procedure3Grid.add(saveProcedure3, 0, 4);
		
		VBox procedure3Box = new VBox(10);
		procedure3Box.getChildren().add(procedure3Grid);
		
		
		HBox procedureBox = new HBox(10);
		procedureBox.getChildren().addAll(procedure1Box,procedure2Box,procedure3Box);
		
		
		HBox topBox = new HBox(10);
		topBox.getChildren().addAll(patientInfoBox,procedureBox);
		
		VBox outerBox = new VBox(10);
		outerBox.getChildren().addAll(topBox,showOutputButton,exitButton,textOutput);
		
		Scene scene = new Scene(outerBox, 400, 200);
		stage.setTitle("Patient & Procedure info");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		System.out.println("Hello world");
		launch();
	}

	
	// method to display patient information.
	public void displayPatient(Patient p) {
		System.out.println(p.toString());
	}
	// method to display procedure's information
	public void displayProcedure(Procedure p) {
		System.out.println(p.toString());
	}
	// method that return the total charge of the procedures
	public double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getCharge() + procedure2.getCharge() + procedure3.getCharge();
	}

}




class Procedure{
	private String name;
	private String date;
	private String practitionerName;
	private double charge;
	
	// no argument constructor
	public Procedure() {
	}
	// constructor that initializes procedure's name and date to the given values
	public Procedure(String procedureName,String date) {
		this.name = procedureName;
		this.date = date;
	}
	// constructor that initializes all attributes of the procedure.
	public Procedure(
			String name,
			String date,
			String practitionerName,
			double charge
	) {
		this.name = name;
		this.date = date;
		this.practitionerName = practitionerName;
		this.charge = charge;
	}
	public String toString() {
		return "Proceduree: " + name + '\n' + "ProcedureDate:  " + date + '\n' + "Practitioner: " + practitionerName + '\n' + "Charge: " + charge;
	}
	
	//
	//
	// setter
	public void setName(String name) { this.name = name;}
	public void setDate(String date) { this.date = date;}
	public void setPractitionerName(String practitionerName) {this.practitionerName = practitionerName;}
	public void setCharge(double charge) {this.charge = charge;}
	
	//
	//
	// getters
	public String getName() {return name;}
	public String getDate() {return date;}
	public String getPractitionerName() {return practitionerName;}
	public double getCharge() {return charge;}
}

class Patient{
	private String firstName;
	private String lastName;
	private String middleName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private String phoneNumber;
	private String nameOfEmergencyContact;
	private String phoneNumberOfEmergencyContact;
	
	// no argument constructor
	public Patient() {
		
	}
	// parameterized constructor for first name, last name, and middle name.
	public Patient(String firstName, String lastName, String middleName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	// parameterized constructor for all attributes
	public Patient(String firstName, 
			String lastName, 
			String middleName, 
			String streetAddress, 
			String city,
			String state,
			int zipCode,
			String phoneNumber,
			String nameOfEmergencyContanct,
			String phoneNumberOfEmergencyContact
	) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.nameOfEmergencyContact = nameOfEmergencyContanct;
		this.phoneNumberOfEmergencyContact = phoneNumberOfEmergencyContact;
		
	}
	
	//
	//
	// method that returns the concatenation of first,middle,last names separated by space.
	public String buildFullName() {
		return firstName + " " +  lastName + " " + middleName;
	}
	// method that returns a concatenation of address, city , state and zipcode separated by space.
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + Integer.toString(zipCode);
	}
	// method that returns a string that is the concatenation of emergency contact name and phone number.
	public String buildEmergencyContact() {
		return nameOfEmergencyContact + " " + phoneNumberOfEmergencyContact;
	}
	// method that display all information of a patient.
	public String toString() {
		return "Patient info:" + '\n' + "Name: " + buildFullName() + '\n' + "Address: " + buildAddress() + '\n' + "EmergencyContact: " + buildEmergencyContact();
	}
	
	//
	//
	// setters
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public void setMiddleName(String name) {
		this.middleName= name;
	}
	public void setStreetAddress(String address) {
		this.streetAddress= address;
	}
	public void setCity(String city) {
		this.firstName = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.state = phoneNumber;
	}
	public void setNameOfEmergencyContact(String name) {
		this.nameOfEmergencyContact = name;
	}
	public void setPhoneNumberOfEmergencyContact(String phoneNumber) {
		this.phoneNumberOfEmergencyContact = phoneNumber;
	}
	
	//
	//
	// getters
	public String getFirstName() {
		return this.firstName;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getStreetAddress() {
		return this.streetAddress;
	}
	public String getCity() {
		return this.city;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getState() {
		return this.state;
	}
	public String getNameOfEmergencyContact() {
		return this.nameOfEmergencyContact;
	}
	public int getZipCode() {
		return this.zipCode;
	}
	public String getPhoneNumberOfEmergencyContact() {
		return this.phoneNumberOfEmergencyContact;
	}
	
}



