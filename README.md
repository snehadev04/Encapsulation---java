# Encapsulation - java 

This repository contains a simple Java project demonstrating the principles of encapsulation in Object-Oriented Programming (OOP). 
The project includes a class representing an Instagram profile with private fields for name, age, and email, along with public methods to set and retrieve these values. 
The main class showcases how to create an instance of the profile, set its values, and display the information.

## Why Encapsulation is Important
Encapsulation is important because it:

### Protects Data Integrity: By restricting direct access to an object's fields, encapsulation prevents the data from being changed in unexpected ways.
### Improves Maintainability: Encapsulation makes it easier to change the implementation of a class without affecting other parts of the program.
### Enhances Security: By hiding the internal state of an object, encapsulation reduces the risk of unauthorized access and modification.
### Promotes Code Reusability: Encapsulation helps in creating modular code that can be reused across different parts of the application.

## Class Details
Instagram Class
Fields:
private String name
private int age
private String email

## Methods:
public void setvalue(String x, int y, String z) - Sets the profile details.
public String getname() - Returns the name.
public int getage() - Returns the age.
public String getemail() - Returns the email.
Encap Class (Main Class)

##Methods:
public static void main(String[] args) - Main method to demonstrate the usage of the Instagram class.

## Usage
To use this project:

### Clone the repository:
Copy code
git clone https://github.com/yourusername/Instagram-Profile-Encapsulation.git

### Navigate to the project directory:
Copy code
cd Instagram-Profile-Encapsulation

### Compile the Java files:
Copy code
javac Instagram.java Encap.java

### Run the main class:
Copy code
java Encap

