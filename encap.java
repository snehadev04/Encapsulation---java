// Define the Instagram class
class instagram {
    // Private instance variables
    private String name;
    private int age;
    private String email;

    // Public method to set values for instance variables
    public void setvalue(String x, int y, String z) {
        name = x;  // Set the name
        age = y;   // Set the age
        email = z; // Set the email
    }

    // Public method to get the name
    public String getname() {
        return name;
    }

    // Public method to get the age
    public int getage() {
        return age;
    }

    // Public method to get the email
    public String getemail() {
        return email;
    }
}

// Define the main class
public class encap {
    // Main method where execution begins
    public static void main(String[] args) {
        // Create an instance of the Instagram class
        instagram a = new instagram();
        // Set values for the instance variables
        a.setvalue("sneha", 25, "snehadev1234@gmail.com");
        // Print the name
        System.out.println(a.getname());
        // Print the age
        System.out.println(a.getage());
        // Print the email
        System.out.println(a.getemail());

        // Alternatively, print everything in one line
        System.out.println(a.getname() + " : " + a.getage() + " : " + a.getemail());
    }
}
