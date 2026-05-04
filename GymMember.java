/**
 * Represents a registered gym member. Inherits from the User class.
 */
public class GymMember extends User {
    private int membershipId;
    private String planType;

    public GymMember(int id, String name, String email, String password, String plan) {
        this.userId = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.planType = plan;
    }

    /**
     * Displays the member's current gym plan information.
     */
    public void viewMembershipDetails() {
        System.out.println("--- Membership Details ---");
        System.out.println("Member Name: " + this.name);
        System.out.println("Plan Type: " + this.planType);
        System.out.println("Status: Active");
    }
}