package EduSmart;

public class Admin extends User {

    // Constructor calls the superclass constructor (super) 
    Admin(String name, String email, String UserId) {
        super(name, email, UserId);
    }

    // Method to simulate removing a user from the system
    public void remove(User user) {
    	super.displayWelcome();
        System.out.println("\n\t\t\tUser removed: " + user.getName());
    }

    // Overrides abstract method from User class 
    public void viewProfile() {
        System.out.println("\n\t\t\t Admin Profile \n");
        System.out.println("\tName: " + getName());
        System.out.println("\tEmail: " + getEmail());
        System.out.println("\tUserId: " + getUserId());
    }
}


